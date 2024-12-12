package extra.creational.abstractfactory;

import extra.creational.abstractfactory.carspecs.Traction;
import extra.creational.abstractfactory.carspecs.Wheels;
import extra.creational.abstractfactory.factory.BusFactory;
import extra.creational.abstractfactory.factory.CarFactory;
import extra.creational.abstractfactory.factory.ForestTruckFactory;

public class SalesShop {
	public static void main(String[] args) {
		Vehicle offRoadCar = new Vehicle(new ForestTruckFactory());
		offRoadCar.display();
		
		Vehicle publicTransportCar = new Vehicle(new BusFactory());
		publicTransportCar.display();
	}
}

class Vehicle {
	private Wheels wheels;
	private Traction traction;
	
	public Vehicle(CarFactory factory) {
		this.wheels = factory.createWheels();
		this.traction = factory.createTractionType();
	}
	
	public void display() {
		String text = "Wheels [" + wheels.getDescription() + "], " +
			   "Number of Wheels [" + wheels.getNumberOfWheels() + "], " +
			   "Traction type [" + traction.getDescription() + "]";
		System.out.println(text);
	}
	
	
}
