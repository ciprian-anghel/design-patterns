package designpatterns.creational.factorymethod.creator;

import designpatterns.creational.factorymethod.product.Transport;

public abstract class LogisticsFactory {

	public void planDelivery() {
		Transport transport = getTransport();
		transport.deliver();
	}
	
	public abstract Transport getTransport();
	
}
