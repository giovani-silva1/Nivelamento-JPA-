package com.nivelamentoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nivelamentoJPA.entities.Pessoa;

public class JPAFind {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nivelamento-jpa");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Pessoa pessoaEncontrada = entityManager.find(Pessoa.class,4);
		System.out.println(pessoaEncontrada);
		
	}
}
