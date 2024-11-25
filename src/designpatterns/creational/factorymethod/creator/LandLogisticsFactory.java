package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.Transport;
import designpatterns.creational.factorymethod.product.Truck;

public class LandLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Truck();
	}

}
