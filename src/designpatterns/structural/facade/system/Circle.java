package designpatterns.structural.facade.system;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw circle");
	}
	
}