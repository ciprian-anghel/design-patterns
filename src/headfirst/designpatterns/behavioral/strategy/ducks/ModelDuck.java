package headfirst.designpatterns.behavioral.strategy.ducks;

import headfirst.designpatterns.behavioral.strategy.behaviours.fly.FlyNoWay;
import headfirst.designpatterns.behavioral.strategy.behaviours.quack.Quack;

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
