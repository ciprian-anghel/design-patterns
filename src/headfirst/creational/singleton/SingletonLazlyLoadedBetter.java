package headfirst.creational.singleton;

public class SingletonLazlyLoadedBetter {
	
	private volatile static SingletonLazlyLoadedBetter instance;
	
	private SingletonLazlyLoadedBetter() {}

	/*
	 * This uses synchronized only once when creating new instance.
	 */
	public static SingletonLazlyLoadedBetter getInstance() {
		if (instance == null) {
			synchronized (SingletonLazlyLoadedBetter.class) {
				if (instance == null) {
					instance = new SingletonLazlyLoadedBetter();
				}
			}
		}
		return instance;
	}
}
