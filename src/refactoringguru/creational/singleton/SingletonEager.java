package refactoringguru.creational.singleton;

import java.util.Random;

public class SingletonEager {
	
	private static final SingletonEager INSTANCE = new SingletonEager();
	private int randomValue;
	
	private SingletonEager() {
		Random random = new Random();
		randomValue = random.nextInt(100);
	}
	
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
	
	public void showRandomValue() {
		System.out.println("The random value of SingletonEager is " + randomValue);
	}
}
