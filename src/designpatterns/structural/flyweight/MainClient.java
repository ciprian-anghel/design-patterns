package designpatterns.structural.flyweight;

import java.awt.Color;

import designpatterns.structural.flyweight.forest.Forest;

/*
 * Also known as
 * 		Cache
 * 
 * Intent
 * 		Flyweight is a structural design pattern that lets you fit more objects
 * 		into the available amount of RAM by sharing common parts of state between 
 * 		multiple objects instead of keeping all of the data in each object.
 * 
 * Flyweight and immutability
 * 		Since the same flyweight object can be used in different contexts, 
 * 		you have to make sure that its state can’t be modified. 
 * 
 * Applicability
 * 		Use the Flyweight pattern only when your program must support a huge number of objects 
 * 		which barely fit into available RAM.
 * 
 * Flyweight factory
 * 		For more convenient access to various flyweights, you can create a factory method 
 * 		that manages a pool of existing flyweight objects.
 */
public class MainClient {

	static int CANVAS_SIZE = 500;
	static int TREES_TO_DRAW = 1_000_000;
	static int TREE_TYPES = 2;

	// Example of rendering a forst
	// Render 1 000 000 trees. 
	// Duplicate data will be cached and shared (TreeType) using the TreeFactory
	public static void main(String[] args) {
		Forest forest = new Forest();
		for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
			forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN);
			forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE);
		}

		forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
		forest.setVisible(true);

		System.out.println(TREES_TO_DRAW + " trees drawn");
		System.out.println("---------------------");
		System.out.println("Memory usage:");
		System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
		System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
		System.out.println("---------------------");
		System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) + "MB (instead of "
				+ ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
	}

	private static int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}
