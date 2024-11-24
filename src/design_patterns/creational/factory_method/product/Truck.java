package design_patterns.creational.factory_method.product;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Land delivery!");
	}

}
