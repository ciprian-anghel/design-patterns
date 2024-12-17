package headfirst.behavioral.iterator;

import headfirst.behavioral.iterator.menu.DinerMenu;
import headfirst.behavioral.iterator.menu.PancakeHouseMenu;

public class Main {

	public static void main(String[] args) {
		
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
		
	}
	
}
