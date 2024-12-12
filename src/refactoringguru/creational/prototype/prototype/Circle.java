package refactoringguru.creational.prototype.prototype;

public class Circle extends Shape {

	private int radius;
	
	//Regular constructors
	public Circle() {
		super();
	}
	
	public Circle(Circle circle) {
		super(circle);
		this.radius = circle.radius;
	}
	
	@Override
	public Circle clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
