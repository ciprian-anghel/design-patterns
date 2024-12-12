package headfirst.creational.abstractfactory;

import headfirst.creational.abstractfactory.factory.NYPizzaStore;
import headfirst.creational.abstractfactory.factory.PizzaStore;
import headfirst.creational.abstractfactory.pizzas.Pizza;

public class PizzaMain {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("NY pizza: " + pizza.getName());
	}

}
