package designpatterns.creational.abstractfactory.product;

public class VictorianChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit on victorian chair");
	}

}
