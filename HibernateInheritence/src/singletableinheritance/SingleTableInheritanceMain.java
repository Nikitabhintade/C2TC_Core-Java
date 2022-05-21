package singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceMain
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");		

		EntityManager em = factory.createEntityManager();										
		em.getTransaction().begin();																	
		
		Employee e = new Employee();
		e.setEmpName("Rudra");
		e.setEmpSalary(22000);
		em.persist(e);														
		
		Manager m = new Manager();
		m.setEmpName("Maya");
		m.setEmpSalary(89000);
		em.persist(m);
		
		em.getTransaction().commit();														
		System.out.println("Rows Inserted..!!");
		
		em.close();																				
		factory.close();														
	}
}
