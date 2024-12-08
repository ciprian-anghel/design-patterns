package headfirst.designpatterns.chapter1.ducks;

import headfirst.designpatterns.chapter1.behaviours.fly.FlyBehaviour;
import headfirst.designpatterns.chapter1.behaviours.quack.QuackBehaviour;

public abstract class Duck {
	
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
}
