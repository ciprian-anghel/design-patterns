package headfirst.designpatterns.structural.decorator.decorators;

import headfirst.designpatterns.structural.decorator.components.Beverage;

public abstract class CondimentDecorator extends Beverage {

	@Override
	public abstract String getDescription();
	
}
