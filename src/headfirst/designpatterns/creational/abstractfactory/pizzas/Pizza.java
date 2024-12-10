package headfirst.designpatterns.creational.abstractfactory.pizzas;

import headfirst.designpatterns.creational.abstractfactory.ingredients.Cheese;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Clam;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Dough;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Pepperoni;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Sauce;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Veggie;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggie[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;

	//The concrete implementation will be handled by each type of cheese
	//which will be using a type of PizzaIngredientFactory, 
	//so each ingredient variation is decoupled from the Pizza
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setNmae(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
