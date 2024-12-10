package headfirst.designpatterns.structural.decorator;

import headfirst.designpatterns.structural.decorator.components.Beverage;
import headfirst.designpatterns.structural.decorator.components.Espresso;
import headfirst.designpatterns.structural.decorator.components.HouseBlend;
import headfirst.designpatterns.structural.decorator.decorators.Mocha;
import headfirst.designpatterns.structural.decorator.decorators.Soy;
import headfirst.designpatterns.structural.decorator.decorators.Whip;

public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
	}

}
