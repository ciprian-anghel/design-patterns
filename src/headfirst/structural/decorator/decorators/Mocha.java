package headfirst.structural.decorator.decorators;

import headfirst.structural.decorator.components.Beverage;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20d;
	}

}
