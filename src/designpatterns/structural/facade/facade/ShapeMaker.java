package designpatterns.structural.facade.facade;

import designpatterns.structural.facade.system.Circle;
import designpatterns.structural.facade.system.Rectangle;
import designpatterns.structural.facade.system.Shape;
import designpatterns.structural.facade.system.Square;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
}
