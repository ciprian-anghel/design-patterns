package headfirst.creational.factorymethod.pizzas;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("preparing " + name);
		System.out.println("Tossing dough " + dough);
		System.out.println("Adding sauce " + sauce);
		System.out.println("Adding toppings: ");
		toppings.forEach(t -> System.out.println("   " + t));
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}

}
