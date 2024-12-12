package headfirst.structural.decorator.decorators;

import headfirst.structural.decorator.components.Beverage;

public abstract class CondimentDecorator extends Beverage {

	@Override
	public abstract String getDescription();
	
}
