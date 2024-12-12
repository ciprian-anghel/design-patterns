package headfirst.creational.abstractfactory.factory;

import headfirst.creational.abstractfactory.ingredients.Cheese;
import headfirst.creational.abstractfactory.ingredients.Clam;
import headfirst.creational.abstractfactory.ingredients.Dough;
import headfirst.creational.abstractfactory.ingredients.Pepperoni;
import headfirst.creational.abstractfactory.ingredients.Sauce;
import headfirst.creational.abstractfactory.ingredients.Veggie;

//This is an abstract factory
public interface PizzaIngredientFactory {
	
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggie[] createVeggies();
	Pepperoni createPepperoni();
	Clam createClam();

}
