package design_patterns.creational.factory_method.creator;

import design_patterns.creational.factory_method.product.Transport;

public abstract class LogisticsFactory {

	public void planDelivery() {
		Transport transport = getTransport();
		transport.deliver();
	}
	
	public abstract Transport getTransport();
	
}
