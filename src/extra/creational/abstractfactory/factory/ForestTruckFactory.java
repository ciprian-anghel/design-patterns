package extra.creational.abstractfactory.factory;

import extra.creational.abstractfactory.carspecs.AllWheelsTraction;
import extra.creational.abstractfactory.carspecs.OffRoadWheels;
import extra.creational.abstractfactory.carspecs.Traction;
import extra.creational.abstractfactory.carspecs.Wheels;

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
