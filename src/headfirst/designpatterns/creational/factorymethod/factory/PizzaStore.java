package headfirst.designpatterns.creational.factorymethod.factory;

import headfirst.designpatterns.creational.factorymethod.pizzas.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	//This is an abstract factory method
	public abstract Pizza createPizza(String type);
}
