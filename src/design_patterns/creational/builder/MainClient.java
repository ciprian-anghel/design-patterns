package design_patterns.creational.builder;

import design_patterns.creational.builder.builder.CarBuilder;
import design_patterns.creational.builder.product.Car;

/*
 * Use the Builder pattern when you want your code to be able 
 * to create different representations of some product (for example, stone and wooden houses)
 * without creating `telescopic constructors`. 
 */
public class MainClient {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		Car offRoadCar = director.buildOffRoadCar(CarBuilder.createBuilder());
		Car sportsCar = director.buildSportsCar(CarBuilder.createBuilder());
		
		System.out.println("Off road - " + offRoadCar);
		System.out.println("Sports - " + sportsCar);
		
	}
	
}
