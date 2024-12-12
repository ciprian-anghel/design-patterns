package headfirst.creational.singleton;

/*
 * This is better for cases when creation of the singleton is not expensive at the startup
 * and the application always needs and uses the singleton object.
 * 
 * KVM guarantees only one instance will be created when static field is loaded. No syncronized is needed.
 */
public class SingletonEagerlyLoaded {
	
	private static final SingletonEagerlyLoaded INSTANCE = new SingletonEagerlyLoaded();
	
	private SingletonEagerlyLoaded() {}

	public static SingletonEagerlyLoaded getInstance() {
		return INSTANCE;
	}
}
