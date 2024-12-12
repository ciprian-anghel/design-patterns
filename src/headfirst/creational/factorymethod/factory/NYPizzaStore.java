package headfirst.creational.factorymethod.factory;

import java.security.InvalidParameterException;

import headfirst.creational.factorymethod.pizzas.NYStyleCheesePizza;
import headfirst.creational.factorymethod.pizzas.Pizza;

//createPizza() is a FACTORY METHOD
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else {
			throw new InvalidParameterException("Pizza " + type + " is not available.");
		}
		
//		if (type.equals("cheese")) {
//			pizza = new NYStyleCheesePizza();
//		} else if (type.equals("pepperoni")) {
//			pizza = new NYStylePepperoniPizza();
//		} else if (type.equals("clam")) {
//			pizza = new NYStyleClamPizza();
//		} else if (type.equals("veggie")) {
//			pizza = new NYStyleVeggiePizza();
//		}
		
		return pizza;
	}
	
}
