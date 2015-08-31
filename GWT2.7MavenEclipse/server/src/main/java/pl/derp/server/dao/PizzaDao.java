/**
 * 
 */
package pl.derp.server.dao;


import java.util.logging.Level;
import java.util.logging.Logger;

import pl.derp.server.entity.Pizza;




/**
 * @author Korbel Daniel
 *
 */
public class PizzaDao {



	private static final Logger rootLogger = Logger.getLogger("");

	public void test() {
	
	}

	public static void save(Pizza pizza) {
		// save pizza instance
		//String a = "-----------------------------_SERVER LOGGER-- " + pizza.getName() + pizza.getVersion() + pizza.getIngredients() ;
		
		String a = "          cccccc";
		rootLogger.log(Level.INFO, a);
		rootLogger.log(Level.SEVERE, a);

		
//		JPA.em()
//		.getTransaction()
//		.begin();
//		JPA.em().persist(pizza);
//		JPA.em().getTransaction().commit();
//		JPA.close();
		
		
		rootLogger.log(Level.WARNING, a);
		rootLogger.log(Level.OFF, a);


	}

	public static Pizza findById(Long id) {
		
		Pizza pizza = new Pizza();
		pizza.setName("Pizza daniela");
		
		String a = "-----------------------------_SERVER LOGGER-- " + id + pizza.getName();
		// ook-up pizza instance

		rootLogger.log(Level.INFO, a);
		rootLogger.log(Level.OFF, a);
		rootLogger.log(Level.SEVERE, a);
		rootLogger.log(Level.WARNING, a);

		//return pizza;
//		return JPA.em().find(Pizza.class, id);
		return new Pizza(777L);

	}
}
