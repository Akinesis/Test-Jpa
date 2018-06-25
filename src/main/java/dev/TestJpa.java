package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("jpa_test");
		EntityManager em = entityMangerFactory.createEntityManager();

		//Livre livre = em.find(Livre.class, 2);
		TypedQuery<Livre> result = em.createQuery("SELECT l FROM Livre l WHERE l.title='Germinal'",Livre.class);
		Livre livre = result.getResultList().get(0);
		
		System.out.println(livre);
		
		em.close();
		entityMangerFactory.close();
	}

}
