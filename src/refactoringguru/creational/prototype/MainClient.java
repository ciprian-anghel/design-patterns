package refactoringguru.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import refactoringguru.creational.prototype.prototype.Circle;
import refactoringguru.creational.prototype.prototype.Rectangle;
import refactoringguru.creational.prototype.prototype.Shape;

/*
 * Also known as: Clone
 *
 * Intent:	Prototype is a creational design pattern that lets you copy existing objects 
 * 			without making your code dependent on their classes.
 * 
 * Applicability:
 * 			Use the Prototype pattern when your code shouldn’t depend on the concrete classes 
 * 			of objects that you need to copy.	
 * 
 * 			Use the pattern when you want to reduce the number of subclasses that only differ 
 * 			in the way they initialize their respective objects.
 */
public class MainClient {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(20);
		circle.setRadius(2);
		shapes.add(circle);
		
		Circle copyOfCircle = circle.clone();
		shapes.add(copyOfCircle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(200);
		rectangle.setHeight(50);
		shapes.add(rectangle);
		
		someBusinessLogicToCopyShapes(shapes);
	}
	
	public static void someBusinessLogicToCopyShapes(List<Shape> shapes) {
		List<Shape> otherShapes = new ArrayList<>();
		
		// Prototype rocks because it lets you produce a copy of
        // an object without knowing anything about its type.
		otherShapes = shapes.stream()
			  .map(s -> s.clone())
			  .toList();
		
		shapes.forEach(System.out::println);
		//This list contains only NEW objects
		otherShapes.forEach(System.out::println);
	}
	
}
