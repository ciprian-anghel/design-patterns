package refactoringguru.creational.builder;

import refactoringguru.creational.builder.builder.CarBuilder;
import refactoringguru.creational.builder.product.Car;

/*
 * Intent: 	Builder is a creational design pattern that lets you construct 
 * 			complex objects step by step. The pattern allows you to produce different types 
 * 			and representations of an object using the same construction code.
 * 
 * Applicability: 
 * 			Use the Builder pattern to get rid of a “telescoping constructor”.
 * 			
 * 			Use the Builder pattern when you want your code to be able 
 * 			to create different representations of some product (for example, stone and wooden houses)
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
