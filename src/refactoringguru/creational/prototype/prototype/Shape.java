package refactoringguru.creational.prototype.prototype;

public abstract class Shape {

	private int x;
	private int y;
	private String color;

	//Regular constructors
	public Shape() {}
	
	public Shape(Shape shape) {
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;
	}
	
	public abstract Shape clone();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
