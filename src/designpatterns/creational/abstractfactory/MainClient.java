package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.factory.FurnitureFactory;
import designpatterns.creational.abstractfactory.factory.VictorianFurnitureFactory;

/* Intent: 	Abstract Factory is a creational design pattern 
 * 			that lets you produce families of related objects without specifying their concrete classes.
 * 
 * Applicability:
 * 			Use the Abstract Factory when your code needs to work 
 * 			with various families of related products, 
 * 			but you don’t want it to depend on the concrete classes of 
 * 			those products as they might be unknown beforehand or 
 * 			you simply want to allow for future extensibility.
 */
public class MainClient {

	private FurnitureFactory factory;
	
	public MainClient(FurnitureFactory factory) {
		this.factory = factory;
	}
	
	public void useFurniture() {
		factory.createChair().sitOn();
		factory.createTable().eatAt();
	}
	
	public static void main(String[] args) {
		MainClient client = new MainClient(new VictorianFurnitureFactory());
		client.useFurniture();
	}

}
