package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Employee;

public class EmployeeHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("cangroupproject"); 
	
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
	


}
