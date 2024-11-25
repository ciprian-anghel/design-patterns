package design_patterns.creational.builder.builder;

import design_patterns.creational.builder.product.Car;

public interface Builder {
	
	Builder setGps(boolean gps);
	Builder setComputer(boolean computer);
	Builder setElectricSeats(boolean electricSeats);
	Builder setSeats(int seats);
	Builder setDoors(int doors);
	Car getCar();
	
}
