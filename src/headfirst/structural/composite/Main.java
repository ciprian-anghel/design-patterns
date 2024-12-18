package headfirst.structural.composite;

import headfirst.structural.composite.menus.Menu;
import headfirst.structural.composite.menus.MenuComponent;
import headfirst.structural.composite.menus.MenuItem;

public class Main {

	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		//Add to diner menu
		MenuComponent pasta = new MenuItem("Pasta", 
				"Spagetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89);
		dinerMenu.add(pasta);
		dinerMenu.add(dessertMenu);
		
		//Add to dessert menu
		MenuComponent applePie = new MenuItem("Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla icecream",
				true, 1.59);
		dessertMenu.add(applePie);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.print();
		
	}
	
}
