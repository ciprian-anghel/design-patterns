package headfirst.designpatterns.behavioral.strategy.behaviours.fly;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
