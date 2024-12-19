package headfirst.structural.proxy;

public class Main {

	public static void main(String[] args) {
		
		//Placeholder for the RealImage which controlls access to it. Does Lazly initialization.
		Image image = new ProxyImage("test_image.png");
		
		//Image will be loaded from disk and dislayed.
		image.display();
		
		//Image will be displayed without loading again.
		image.display();
	}
	
}
