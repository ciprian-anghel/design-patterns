package headfirst.creational.abstractfactory.factory;

import headfirst.creational.abstractfactory.ingredients.Cheese;
import headfirst.creational.abstractfactory.ingredients.Clam;
import headfirst.creational.abstractfactory.ingredients.Dough;
import headfirst.creational.abstractfactory.ingredients.FreshClam;
import headfirst.creational.abstractfactory.ingredients.Garlic;
import headfirst.creational.abstractfactory.ingredients.MarinaraSauce;
import headfirst.creational.abstractfactory.ingredients.Mushroom;
import headfirst.creational.abstractfactory.ingredients.Onion;
import headfirst.creational.abstractfactory.ingredients.Pepperoni;
import headfirst.creational.abstractfactory.ingredients.RedPepper;
import headfirst.creational.abstractfactory.ingredients.ReggianoCheese;
import headfirst.creational.abstractfactory.ingredients.Sauce;
import headfirst.creational.abstractfactory.ingredients.SlicedPepperoni;
import headfirst.creational.abstractfactory.ingredients.ThinCrustDough;
import headfirst.creational.abstractfactory.ingredients.Veggie;

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
