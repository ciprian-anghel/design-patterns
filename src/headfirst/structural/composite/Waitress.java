package headfirst.structural.composite;

import headfirst.structural.composite.menus.MenuComponent;

public class Waitress {

	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		allMenus.print();
	}
	
}
