package headfirst.creational.singleton;

public class SingletonLazlyLoadedExpensive {
	
	private static SingletonLazlyLoadedExpensive instance;
	
	private SingletonLazlyLoadedExpensive() {}

	/*
	 * This uses synchronized each time the method is called, 
	 * which might be expensive in terms of performance.
	 */
	public static synchronized SingletonLazlyLoadedExpensive getInstance() {
		if (instance == null) {
			instance = new SingletonLazlyLoadedExpensive();
		}
		return instance;
	}
}
