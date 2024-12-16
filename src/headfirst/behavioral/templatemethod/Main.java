package headfirst.behavioral.templatemethod;

import headfirst.behavioral.templatemethod.beverages.CaffeineBeverage;
import headfirst.behavioral.templatemethod.beverages.Coffee;
import headfirst.behavioral.templatemethod.beverages.Tea;

public class Main {
	
	public static void main(String[] args) {
		
		CaffeineBeverage tea = new Tea();
		tea.prepareBeverage();

		CaffeineBeverage coffee = new Coffee();
		coffee.prepareBeverage();
		
	}

}
