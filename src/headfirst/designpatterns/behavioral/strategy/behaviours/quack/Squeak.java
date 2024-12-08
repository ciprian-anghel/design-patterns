package headfirst.designpatterns.behavioral.strategy.behaviours.quack;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
