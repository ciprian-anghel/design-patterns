package headfirst.behavioral.iterator.menu;

import java.util.ArrayList;

import headfirst.behavioral.iterator.iterator.Iterator;
import headfirst.behavioral.iterator.iterator.PancakeHouseMenuIterator;

public class PancakeHouseMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	
}
