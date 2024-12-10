package headfirst.designpatterns.behavioral.strategy.ducks;

import headfirst.designpatterns.behavioral.strategy.behaviours.fly.FlyWithWings;
import headfirst.designpatterns.behavioral.strategy.behaviours.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}