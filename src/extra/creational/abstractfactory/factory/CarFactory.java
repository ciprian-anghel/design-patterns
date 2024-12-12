package extra.creational.abstractfactory.factory;

import extra.creational.abstractfactory.carspecs.Traction;
import extra.creational.abstractfactory.carspecs.Wheels;

public interface CarFactory {

	Wheels createWheels();
	Traction createTractionType();
	
}
