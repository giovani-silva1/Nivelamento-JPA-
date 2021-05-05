package com.nivelamentoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nivelamentoJPA.entities.Pessoa;

public class JPADelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nivelamento-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Pessoa pessoaDeletada = entityManager.find(Pessoa.class,3);
		System.out.println("Pessoa a ser deletada sera :" + pessoaDeletada);
		entityManager.remove(pessoaDeletada);
		System.out.println("Deleção realizada com sucesso");
		entityManager.getTransaction().commit();
		
	}
}
