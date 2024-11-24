package design_patterns.creational.factory_method.creator;

import design_patterns.creational.factory_method.product.Truck;
import design_patterns.creational.factory_method.product.Transport;

public class LandLogisticsFactory extends LogisticsFactory {

	@Override
	public Transport getTransport() {
		return new Truck();
	}

}
