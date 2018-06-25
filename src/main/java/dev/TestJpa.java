package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.Client;
import entities.Emprunt;
import entities.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("jpa_test");
		EntityManager em = entityMangerFactory.createEntityManager();

		//Livre livre = em.find(Livre.class, 2);
		//TypedQuery<Livre> result = em.createQuery("SELECT l FROM Livre l WHERE l.title='Germinal'",Livre.class);
		//Livre livre = result.getResultList().get(0);
		
		//TypedQuery<Emprunt> result = em.createQuery("SELECT e from Emprunt e WHERE e.id=2", Emprunt.class);
		//Emprunt temp = result.getResultList().get(0);
		
		//for(Livre b : temp.getBooks()){
		//System.out.println(b);
		//}
		
		TypedQuery<Client> result = em.createQuery("SELECT c FROM Client c WHERE c.id=1", Client.class);
		Client temp = result.getResultList().get(0);
		
		for(Emprunt e : temp.getEmprunts()){
			System.out.println(e);
		}
		
		//System.out.println(livre);
		
		em.close();
		entityMangerFactory.close();
	}

}
