package com.nivelamentoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nivelamentoJPA.entities.Pessoa;

public class JPAUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nivelamento-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Pessoa pessoaEncontrada = entityManager.find(Pessoa.class, 4);
		pessoaEncontrada.setNome("Novo nome(USADO UPDATE)");
		pessoaEncontrada.setEmail("Novo email(USADO UPDATE)");
		entityManager.merge(pessoaEncontrada);
		entityManager.getTransaction().commit();
		System.out.println("Mudança realizada com sucessso");
	}
}
