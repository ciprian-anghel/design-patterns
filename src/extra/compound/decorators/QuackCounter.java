package extra.compound.decorators;

import extra.compound.behaviours.Quackable;
import extra.compound.observer.Observer;

public class QuackCounter implements Quackable {

	private Quackable duck;
	private static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getNumberOfQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void addObserver(Observer observer) {
		duck.addObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}

}
