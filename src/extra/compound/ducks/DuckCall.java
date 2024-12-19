package extra.compound.ducks;

import extra.compound.behaviours.Quackable;
import extra.compound.observer.Observer;
import extra.compound.observer.QuackerSubject;
import extra.compound.observer.Subject;

//The device with which hunters mimic duck quacks
public class DuckCall implements Quackable {
	
	private Subject subject;
	
	public DuckCall() {
		subject = new QuackerSubject(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
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
