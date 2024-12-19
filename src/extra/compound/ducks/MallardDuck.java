package extra.compound.ducks;

import extra.compound.behaviours.Quackable;
import extra.compound.observer.Observer;
import extra.compound.observer.QuackerSubject;
import extra.compound.observer.Subject;

public class MallardDuck implements Quackable {
	
	private Subject subject;
	
	public MallardDuck() {
		subject = new QuackerSubject(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		subject.addObserver(observer);
	}

	@Override
	public void notifyObservers() {
		subject.notifyObservers();
	}

}
