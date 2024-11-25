package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.Airplane;
import designpatterns.creational.factorymethod.product.Transport;

public class AirLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Airplane();
	}

}
