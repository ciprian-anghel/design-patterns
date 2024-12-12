package refactoringguru.creational.factorymethod.creator;

import refactoringguru.creational.factorymethod.product.Airplane;
import refactoringguru.creational.factorymethod.product.Transport;

public class AirLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Airplane();
	}

}
