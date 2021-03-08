package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Model.Can;
import Model.Employee;

public class EmployeeHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CanGroupProject"); 
	
	public void addEmployee(Employee e) { 
		EntityManager em = emfactory.createEntityManager(); 
		em.getTransaction().begin(); 
		em.persist(e); 
		em.getTransaction().commit(); 
		em.close(); 
	}
	public List<Employee> showAllEmployees() { 
		EntityManager em = emfactory.createEntityManager(); 
		List<Employee> allEmployees = em.createQuery("select e from Employee e").getResultList(); 
		return allEmployees; 
	}
	public static Employee searchForEmployeeById(Integer c) {
		EntityManager Manager = emfactory.createEntityManager();
		Manager.getTransaction().begin();
		Employee found = Manager.find(Employee.class, c);
		Manager.close();
		return found;
	}
	public void deleteEmployee(Employee c)
	{
		EntityManager Manager = emfactory.createEntityManager();
		Manager.getTransaction().begin();
		
		TypedQuery<Employee> typedQuery = Manager.createQuery("select li from Employee li where li.id = :selectedId", Employee.class);
		typedQuery.setParameter("selectedId", c.getId());

		typedQuery.setMaxResults(1);
		Employee result = typedQuery.getSingleResult();
		Manager.remove(result);
		Manager.getTransaction().commit();
		Manager.close();
	}
	


}
