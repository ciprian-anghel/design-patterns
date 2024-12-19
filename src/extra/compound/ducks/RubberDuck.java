package extra.compound.ducks;

import extra.compound.behaviours.Quackable;
import extra.compound.observers.QuackSubject;
import extra.compound.observers.Observer;

public class RubberDuck implements Quackable {

	private QuackSubject subject;
	
	public RubberDuck() {
		this.subject = new QuackSubject(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squack");
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
