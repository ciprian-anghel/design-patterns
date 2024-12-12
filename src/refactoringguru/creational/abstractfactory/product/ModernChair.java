package refactoringguru.creational.abstractfactory.product;

public class ModernChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit on modern chair");
	}

}
