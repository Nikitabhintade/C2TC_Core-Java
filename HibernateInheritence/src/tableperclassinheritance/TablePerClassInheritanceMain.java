package tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritanceMain
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e = new Employee();
		e.setEmpName("Prajakta");
		e.setEmpSalary(15000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("Swati");
		m.setEmpSalary(50000);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted..!!");
		em.close();
		factory.close();
	}
}
