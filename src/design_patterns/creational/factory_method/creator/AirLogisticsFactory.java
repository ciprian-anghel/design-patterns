package design_patterns.creational.factory_method.creator;

import design_patterns.creational.factory_method.product.Airplane;
import design_patterns.creational.factory_method.product.Transport;

public class AirLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Airplane();
	}

}
