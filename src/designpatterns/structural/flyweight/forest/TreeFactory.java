package designpatterns.structural.flyweight.forest;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/*
	Flyweight factory decides whether to re-use existing
	flyweight or to create a new object.
*/
public class TreeFactory {
	
	static Map<String, TreeType> treeTypes = new HashMap<>();
	
	public static TreeType getTreeType(String name, Color color) {
		TreeType result = treeTypes.get(name);
		if (result == null) {
			result = new TreeType(color);
			treeTypes.put(name, result);
		}
		return result;
	}
	
}
