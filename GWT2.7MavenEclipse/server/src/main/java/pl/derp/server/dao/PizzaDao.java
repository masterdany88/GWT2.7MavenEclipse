/**
 * 
 */
package pl.derp.server.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import pl.derp.server.entity.Pizza;

/**
 * @author Korbel Daniel
 *
 */
public class PizzaDao {

	private static final Logger rootLogger = Logger.getLogger("");

	public static void test() {
		String a = "          test test test";
		rootLogger.log(Level.INFO, a);
		rootLogger.log(Level.SEVERE, a);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		// Read the existing entries and write to console
		Query q = em.createQuery("SELECT u FROM Pizza u");
		List<Pizza> userList = q.getResultList();
		for (Pizza user : userList) {
			rootLogger.log(Level.INFO, "==== " + user.getName());
		}
		System.out.println("Size: " + userList.size());

		// Create new Pizza
		em.getTransaction().begin();
		Pizza user = new Pizza();
		user.setName("Tom Johnson");

		em.persist(user);
		em.getTransaction().commit();

		em.close();
		
		rootLogger.log(Level.WARNING, a);
		rootLogger.log(Level.OFF, a);
	}

	public static void save(Pizza pizza) {
		// save pizza instance
		// String a = "-----------------------------_SERVER LOGGER-- " +
		// pizza.getName() + pizza.getVersion() + pizza.getIngredients() ;

		String a = "          xxxxxxxx";
		rootLogger.log(Level.INFO, a);
		rootLogger.log(Level.SEVERE, a);

		// JPA.em()
		// .getTransaction()
		// .begin();
		// JPA.em().persist(pizza);
		// JPA.em().getTransaction().commit();
		// JPA.close();

		rootLogger.log(Level.WARNING, a);
		rootLogger.log(Level.OFF, a);

	}

	public static Pizza findById(Long id) {

		Pizza pizza = new Pizza();
		pizza.setName("Pizza daniela");

		String a = "-----------------------------_SERVER LOGGER-- " + id
				+ pizza.getName();
		// ook-up pizza instance

		rootLogger.log(Level.INFO, a);
		rootLogger.log(Level.OFF, a);
		rootLogger.log(Level.SEVERE, a);
		rootLogger.log(Level.WARNING, a);

		// return pizza;
		// return JPA.em().find(Pizza.class, id);
		return new Pizza(777L);

	}
}
