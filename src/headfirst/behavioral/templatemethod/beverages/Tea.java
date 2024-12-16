package headfirst.behavioral.templatemethod.beverages;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon");
	}
	
}
