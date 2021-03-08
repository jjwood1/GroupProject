package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Purchases;

public class PurchasesHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("cangroupproject");
	
	public void addPurchase(Purchases p) { 
		EntityManager em = emfactory.createEntityManager(); 
		em.getTransaction().begin(); 
		em.persist(p); 
		em.getTransaction().commit();
		em.close();
	}
	public List<Purchases> showAllPurchases() { 
		EntityManager em = emfactory.createEntityManager(); 
		List<Purchases> allPurchases = em.createQuery("Select p from purchase p").getResultList(); 
		return allPurchases; 
	}
	public Purchases searchPurchaseByID(Integer tempID) { 
		EntityManager em = emfactory.createEntityManager(); 
		em.getTransaction().begin();
		Purchases found = em.find(Purchases.class, tempID);
		em.close(); 
		return found; 
	}
	
	
	
}
