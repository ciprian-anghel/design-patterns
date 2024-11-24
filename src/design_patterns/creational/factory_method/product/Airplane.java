package design_patterns.creational.factory_method.product;

public class Airplane implements Transport {

	@Override
	public void deliver() {
		System.out.println("Air Delivery!");
	}
	
}
