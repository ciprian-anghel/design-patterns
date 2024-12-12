package extra.creational.abstractfactory.factory;

import extra.creational.abstractfactory.carspecs.BusWheels;
import extra.creational.abstractfactory.carspecs.FrontWheelTraction;
import extra.creational.abstractfactory.carspecs.Traction;
import extra.creational.abstractfactory.carspecs.Wheels;

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
