package myexamples.creational.abstractfactory.factory;

import myexamples.creational.abstractfactory.carspecs.BusWheels;
import myexamples.creational.abstractfactory.carspecs.FrontWheelTraction;
import myexamples.creational.abstractfactory.carspecs.Traction;
import myexamples.creational.abstractfactory.carspecs.Wheels;

public class BusFactory implements CarFactory {

	@Override
	public Wheels createWheels() {
		return new BusWheels();
	}

	@Override
	public Traction createTractionType() {
		return new FrontWheelTraction();
	}
	
}
