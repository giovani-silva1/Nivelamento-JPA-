package com.nivelamentoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nivelamentoJPA.entities.Pessoa;

public class JPAInsert {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nivelamento-jpa");
		EntityManager emEntityManager = entityManagerFactory.createEntityManager();
		
		emEntityManager.getTransaction().begin();
		Pessoa pessoa = new Pessoa(null,"Inserindo user","User@gmail.com");
		emEntityManager.persist(pessoa);
		System.out.println("Cadastrado pessoa com sucesso");
		emEntityManager.getTransaction().commit();
		
		
	}
}
