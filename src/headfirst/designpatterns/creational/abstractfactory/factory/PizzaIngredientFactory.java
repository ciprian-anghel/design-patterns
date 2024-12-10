package headfirst.designpatterns.creational.abstractfactory.factory;

import headfirst.designpatterns.creational.abstractfactory.ingredients.Cheese;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Clam;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Dough;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Pepperoni;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Sauce;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Veggie;

//This is an abstract factory
public interface PizzaIngredientFactory {
	
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggie[] createVeggies();
	Pepperoni createPepperoni();
	Clam createClam();

}
