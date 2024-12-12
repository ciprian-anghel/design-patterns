package refactoringguru.creational.builder.builder;

import refactoringguru.creational.builder.product.Car;

public class CarBuilder implements Builder {

	private Car car;
	
	private CarBuilder() {
		car = new Car();
	}

	public static Builder createBuilder() {
		//create a new builder each time method is called.
		//this is a must in order to not have multi-threading issues.
		return new CarBuilder();
	}
	
	@Override
	public Builder setGps(boolean gps) {
		car.setGps(gps);
		return this;
	}

	@Override
	public Builder setComputer(boolean computer) {
		car.setComputer(computer);
		return this;
	}

	@Override
	public Builder setElectricSeats(boolean electricSeats) {
		car.setElectricSeats(electricSeats);
		return this;
	}

	@Override
	public Builder setSeats(int seats) {
		car.setSeats(seats);
		return this;
	}

	@Override
	public Builder setDoors(int doors) {
		car.setDoors(doors);
		return this;
	}

	@Override
	public Car getCar() {
		Car product = this.car;
		//Resets the object in order to not expose the built object.
		this.car = new Car(); 
		return product;
	}
	
}
