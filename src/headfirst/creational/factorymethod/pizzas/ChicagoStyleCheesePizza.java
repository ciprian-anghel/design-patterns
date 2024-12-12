package headfirst.creational.factorymethod.pizzas;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		toppings.add("Shredded mozzarella cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
