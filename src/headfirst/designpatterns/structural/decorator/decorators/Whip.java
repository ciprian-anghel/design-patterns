package headfirst.designpatterns.structural.decorator.decorators;

import headfirst.designpatterns.structural.decorator.components.Beverage;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10d;
	}

}
