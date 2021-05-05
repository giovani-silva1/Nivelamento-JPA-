package com.nivelamentoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nivelamentoJPA.entities.Pessoa;

@SpringBootApplication
public class NivelamentojpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NivelamentojpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa(null, "Pesso1", "pessoa@gmail.com");
		Pessoa p2 = new Pessoa(null, "Pesso2", "pessoa2@gmail.com");
		Pessoa p3 = new Pessoa(null, "Pesso3", "pessoa3@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nivelamento-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.getTransaction().commit();
		System.out.println("Pronto");

	}

}
