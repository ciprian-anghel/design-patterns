package myexamples.creational.abstractfactory.factory;

import myexamples.creational.abstractfactory.carspecs.Traction;
import myexamples.creational.abstractfactory.carspecs.Wheels;

public interface CarFactory {

	Wheels createWheels();
	Traction createTractionType();
	
}
