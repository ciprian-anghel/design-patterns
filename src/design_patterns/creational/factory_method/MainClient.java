package design_patterns.creational.factory_method;

import design_patterns.creational.factory_method.creator.AirLogisticsFactory;
import design_patterns.creational.factory_method.creator.LandLogisticsFactory;
import design_patterns.creational.factory_method.creator.LogisticsFactory;

/*
 * Factory Method pattern naming: 
 * - Factory - because its a creational pattern
 * - Method - because creator/factory is using a method to create the product
 */
public class MainClient {
	
	public static void planRoute(LogisticsFactory logistics) {
		logistics.planDelivery();
	}
	
	public static void main(String ...args) {
		
		LogisticsFactory landLogistics = new LandLogisticsFactory();
		LogisticsFactory airLogistics = new AirLogisticsFactory();
		
		planRoute(landLogistics);
		planRoute(airLogistics);
		
	}
}
