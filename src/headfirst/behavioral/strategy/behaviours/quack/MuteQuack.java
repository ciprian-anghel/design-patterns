package headfirst.behavioral.strategy.behaviours.quack;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("*silence*");
	}

}
