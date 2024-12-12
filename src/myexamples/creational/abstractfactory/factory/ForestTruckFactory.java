package myexamples.creational.abstractfactory.factory;

import myexamples.creational.abstractfactory.carspecs.AllWheelsTraction;
import myexamples.creational.abstractfactory.carspecs.OffRoadWheels;
import myexamples.creational.abstractfactory.carspecs.Traction;
import myexamples.creational.abstractfactory.carspecs.Wheels;

public class ForestTruckFactory implements CarFactory {

	@Override
	public Wheels createWheels() {
		return new OffRoadWheels();
	}

	@Override
	public Traction createTractionType() {
		return new AllWheelsTraction();
	}
	

}
