package headfirst.designpatterns.creational.factorymethod;

import headfirst.designpatterns.creational.factorymethod.factory.ChicagoPizzaStore;
import headfirst.designpatterns.creational.factorymethod.factory.NYPizzaStore;
import headfirst.designpatterns.creational.factorymethod.factory.PizzaStore;
import headfirst.designpatterns.creational.factorymethod.pizzas.Pizza;

public class PizzaMain {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("NY pizza: " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Chicago pizza: " + pizza.getName());
	}

}
