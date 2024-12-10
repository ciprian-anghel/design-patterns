package headfirst.designpatterns.creational.abstractfactory;

import headfirst.designpatterns.creational.abstractfactory.factory.NYPizzaStore;
import headfirst.designpatterns.creational.abstractfactory.factory.PizzaStore;
import headfirst.designpatterns.creational.abstractfactory.pizzas.Pizza;

public class PizzaMain {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("NY pizza: " + pizza.getName());
	}

}
