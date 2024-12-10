package headfirst.designpatterns.creational.abstractfactory.factory;

import headfirst.designpatterns.creational.abstractfactory.ingredients.Cheese;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Clam;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Dough;
import headfirst.designpatterns.creational.abstractfactory.ingredients.FreshClam;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Garlic;
import headfirst.designpatterns.creational.abstractfactory.ingredients.MarinaraSauce;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Mushroom;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Onion;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Pepperoni;
import headfirst.designpatterns.creational.abstractfactory.ingredients.RedPepper;
import headfirst.designpatterns.creational.abstractfactory.ingredients.ReggianoCheese;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Sauce;
import headfirst.designpatterns.creational.abstractfactory.ingredients.SlicedPepperoni;
import headfirst.designpatterns.creational.abstractfactory.ingredients.ThinCrustDough;
import headfirst.designpatterns.creational.abstractfactory.ingredients.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

}
