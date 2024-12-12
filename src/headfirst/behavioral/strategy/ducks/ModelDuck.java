package headfirst.behavioral.strategy.ducks;

import headfirst.behavioral.strategy.behaviours.fly.FlyNoWay;
import headfirst.behavioral.strategy.behaviours.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}
