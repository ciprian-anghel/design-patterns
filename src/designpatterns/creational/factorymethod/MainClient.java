package designpatterns.creational.factorymethod;

import designpatterns.creational.factorymethod.creator.AirLogisticsFactory;
import designpatterns.creational.factorymethod.creator.LandLogisticsFactory;
import designpatterns.creational.factorymethod.creator.LogisticsFactory;

/*
 *  When to use:
 *  		 If your object creation process is complex or varies under different conditions, 
 *  		 using a factory method can make your client code simpler and promote reusability.
 * 
 * 	Creator: This is an abstract class or an interface that declares the factory method. 
 * 			 The creator typically contains a method that serves as a factory for creating objects. 
 * 			 It may also contain other methods that work with the created objects.
 *	Concrete Creator: Concrete Creator classes are subclasses of the Creator 
 *			 that implement the factory method to create specific types of objects. 
 *			 Each Concrete Creator is responsible for creating a particular product.
 *	Product: This is the interface or abstract class for the objects that the factory method creates. 
 *			 The Product defines the common interface for all objects that the factory method can create.
 *	Concrete Product: 
 *			 Concrete Product classes are the actual objects that the factory method creates. 
 *			 Each Concrete Product class implements the Product interface or extends the Product abstract class.
 */
public class MainClient {
	
	public static void main(String[] args) {
		
		args = new String[1];
		args[0] = "land";
		
		LogisticsFactory logistics;
		if (args[0] == "air" ) {
			logistics = new AirLogisticsFactory();
		} else if (args[0] == "land") {
			logistics = new LandLogisticsFactory();
		} else {
			throw new RuntimeException("Logistics not available for selected type.");
		}
		logistics.planDelivery();
	}
}
