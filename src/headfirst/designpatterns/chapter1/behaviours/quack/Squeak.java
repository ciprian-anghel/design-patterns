package headfirst.designpatterns.chapter1.behaviours.quack;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
