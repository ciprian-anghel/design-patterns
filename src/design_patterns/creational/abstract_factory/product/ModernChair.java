package design_patterns.creational.abstract_factory.product;

public class ModernChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit on modern chair");
	}

}
