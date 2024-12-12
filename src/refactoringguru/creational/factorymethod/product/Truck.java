package refactoringguru.creational.factorymethod.product;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Land delivery!");
	}

}
