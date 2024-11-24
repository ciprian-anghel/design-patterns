package design_patterns.creational.abstract_factory.product;

public class VictorianChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit on victorian chair");
	}

}
