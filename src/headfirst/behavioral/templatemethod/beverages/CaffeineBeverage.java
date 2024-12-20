package headfirst.behavioral.templatemethod.beverages;

public abstract class CaffeineBeverage {
	
	//This is a template method
	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}

}
