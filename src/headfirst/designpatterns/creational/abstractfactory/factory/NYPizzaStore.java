package headfirst.designpatterns.creational.abstractfactory.factory;

import java.security.InvalidParameterException;

import headfirst.designpatterns.creational.abstractfactory.pizzas.CheesePizza;
import headfirst.designpatterns.creational.abstractfactory.pizzas.Pizza;
import headfirst.designpatterns.creational.abstractfactory.pizzas.VeggiePizza;

//createPizza() is a FACTORY METHOD
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setNmae("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) { 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setNmae("New York Style Veggie Pizza");
		} else {
			throw new InvalidParameterException("Pizza " + type + " is not available.");
		}
		
		return pizza;
	}
	
}
