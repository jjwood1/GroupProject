package Controller;
import java.util.List;
import Model.Can;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class CanHelper {
	static EntityManagerFactory fact = Persistence.createEntityManagerFactory("CanGroupProject");
	public void insertItem(Can c)
	{
		EntityManager Manager = fact.createEntityManager();
		Manager.getTransaction().begin();
		Manager.persist(c);
		Manager.getTransaction().commit();
		Manager.close();
	}
	public List<Can> showAllItems()
	{	
		EntityManager Manager = fact.createEntityManager();
		List<Can>Everything = Manager.createQuery("SELECT i FROM cans i").getResultList();
		return Everything;
	}
	public void deleteCan(Can c)
	{
		EntityManager Manager = fact.createEntityManager();
		Manager.getTransaction().begin();
		
		TypedQuery<Can> typedQuery = Manager.createQuery("select li from cans li where li.id = :selectedId", Can.class);
		typedQuery.setParameter("selectedId", c.getId());

		typedQuery.setMaxResults(1);
		Can result = typedQuery.getSingleResult();
		Manager.remove(result);
		Manager.getTransaction().commit();
		Manager.close();
	}
	public void updateCar(Can c) {
		EntityManager Manager = fact.createEntityManager();
		Manager.getTransaction().begin();
		Manager.merge(c);
		Manager.getTransaction().commit();
		Manager.close();
	}
	public Can searchForCarById(int c) {
		EntityManager Manager = fact.createEntityManager();
		Manager.getTransaction().begin();
		Can found = Manager.find(Can.class, c);
		Manager.close();
		return found;
	}
	public void cleanUp()
	{
		fact.close();
	}

}
