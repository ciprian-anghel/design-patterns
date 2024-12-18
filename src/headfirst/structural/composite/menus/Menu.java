package headfirst.structural.composite.menus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

	private List<MenuComponent> menuComponents = new ArrayList<>();
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		 this.menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
}
