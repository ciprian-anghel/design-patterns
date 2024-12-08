package headfirst.designpatterns.chapter1.ducks;

import headfirst.designpatterns.chapter1.behaviours.fly.FlyWithWings;
import headfirst.designpatterns.chapter1.behaviours.quack.Quack;

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
