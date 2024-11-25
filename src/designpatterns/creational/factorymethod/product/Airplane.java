package designpatterns.creational.factorymethod.product;

public class Airplane implements Transport {

	@Override
	public void deliver() {
		System.out.println("Air Delivery!");
	}
	
}
