package designpatterns.structural.facade;

import designpatterns.structural.facade.facade.ShapeMaker;

/*
 * Intent
 * 		Facade is a structural design pattern that provides a simplified interface to a library, 
 * 		a framework, or any other complex set of classes.
 * 
 * Applicability
 * 		Use the Facade pattern when you need to have a limited but straightforward interface 
 * 		to a complex subsystem.
 * 
 */
public class MainClient {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
	
}
