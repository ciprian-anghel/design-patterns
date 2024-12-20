package refactoringguru.creational.singleton;

/*
 * Intent: 
 * 			Singleton is a creational design pattern that lets you ensure 
 * 			that a class has only one instance, while providing a global 
 * 			access point to this instance.
 * 
 * Applicability:
 * 			Use the Singleton pattern when a class in your program should 
 * 			have just a single instance available to all clients; for example, 
 * 			a single database object shared by different parts of the program.
 * 
 * 			Use the Singleton pattern when you need stricter control over global variables.
 */
public class MainClient {

	public static void main(String[] args) {
		SingletonEager.getInstance().showRandomValue();
		SingletonLazy.getInstance().showRandomValue();
		SingletonEager.getInstance().showRandomValue();
		SingletonLazy.getInstance().showRandomValue();
	}
	
}
