package headfirst.designpatterns.chapter1.behaviours.quack;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}
	
}
