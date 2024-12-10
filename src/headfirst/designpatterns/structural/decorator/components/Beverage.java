package headfirst.designpatterns.structural.decorator.components;

public abstract class Beverage {

	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
