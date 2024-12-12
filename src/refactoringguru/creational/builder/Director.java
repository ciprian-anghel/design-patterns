package refactoringguru.creational.builder;

import refactoringguru.creational.builder.builder.Builder;
import refactoringguru.creational.builder.product.Car;

/*
 * The director is only responsible for executing the building
 * steps in a particular sequence. It's helpful when producing
 * products according to a specific order or configuration.
 * Strictly speaking, the director class is optional, since the
 * client can control builders directly.
 */
public class Director {

	public Car buildSportsCar(Builder builder) {
		return builder.setComputer(true)
					   .setElectricSeats(true)
					   .setGps(true)
					   .setSeats(2)
					   .setDoors(2)
					   .getCar();
	}
	
	public Car buildOffRoadCar(Builder builder) {
		return builder.setComputer(false)
					   .setElectricSeats(false)
					   .setGps(true)
					   .setSeats(5)
					   .setDoors(4)
					   .getCar();
	}
	
}
