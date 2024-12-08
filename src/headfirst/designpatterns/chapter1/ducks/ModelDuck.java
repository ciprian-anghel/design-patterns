package headfirst.designpatterns.chapter1.ducks;

import headfirst.designpatterns.chapter1.behaviours.fly.FlyNoWay;
import headfirst.designpatterns.chapter1.behaviours.quack.Quack;

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
