package refactoringguru.creational.factorymethod.creator;

import refactoringguru.creational.factorymethod.product.Transport;
import refactoringguru.creational.factorymethod.product.Truck;

public class LandLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Truck();
	}

}
