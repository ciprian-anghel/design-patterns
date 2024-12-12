package headfirst.creational.factorymethod.factory;

import java.security.InvalidParameterException;

import headfirst.creational.factorymethod.pizzas.ChicagoStyleCheesePizza;
import headfirst.creational.factorymethod.pizzas.Pizza;

//createPizza() is a FACTORY METHOD
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else {
			throw new InvalidParameterException("Pizza " + type + " is not available.");
		}
		
//		if (type.equals("cheese")) {
//			pizza = new ChicagoStyleCheesePizza();
//		} else if (type.equals("pepperoni")) {
//			pizza = new ChicagoStylePepperoniPizza();
//		} else if (type.equals("clam")) {
//			pizza = new ChicagoStyleClamPizza();
//		} else if (type.equals("veggie")) {
//			pizza = new ChicagoStyleVeggiePizza();
//		}
		
		return pizza;
	}

}
