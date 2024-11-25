package designpatterns.creational.singleton;

import java.util.Random;

public class SingletonLazy {

	private static SingletonLazy instance;
	private int randomValue;
	
	private SingletonLazy() {
		Random random = new Random();
		randomValue = random.nextInt(100);
	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy.class) {
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}
		}
		return instance;
	}
	
	public void showRandomValue() {
		System.out.println("The random value of SingletonLazy is " + randomValue);
	}
}
