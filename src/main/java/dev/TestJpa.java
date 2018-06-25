package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("jpa_test");
		EntityManager em = entityMangerFactory.createEntityManager();

		Livre livre = em.find(Livre.class, 2);
		
		System.out.println(livre);
		
		em.close();
		entityMangerFactory.close();
	}

}
