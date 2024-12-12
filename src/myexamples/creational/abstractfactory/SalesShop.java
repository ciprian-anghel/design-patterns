package myexamples.creational.abstractfactory;

import myexamples.creational.abstractfactory.carspecs.Traction;
import myexamples.creational.abstractfactory.carspecs.Wheels;
import myexamples.creational.abstractfactory.factory.BusFactory;
import myexamples.creational.abstractfactory.factory.CarFactory;
import myexamples.creational.abstractfactory.factory.ForestTruckFactory;

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
