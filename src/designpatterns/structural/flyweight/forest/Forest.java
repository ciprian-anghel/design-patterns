package designpatterns.structural.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/*
	The Tree and the Forest classes are the flyweight's clients.
	You can merge them if you don't plan to develop the Tree
	class any further.
*/
public class Forest extends JFrame {
	private static final long serialVersionUID = -9196241564406556177L;
	
	private List<Tree> trees = new ArrayList<>();
	
	public void plantTree(int x, int y, String name, Color color) {
		TreeType type = TreeFactory.getTreeType(name, color);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}
	
	@Override
	public void paint(Graphics graphics) {
		for (Tree tree : trees) {
			tree.draw(graphics);
		}
	}
	
}
