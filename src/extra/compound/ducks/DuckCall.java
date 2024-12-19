package extra.compound.ducks;

import extra.compound.behaviours.Quackable;
import extra.compound.observers.QuackSubject;
import extra.compound.observers.Observer;

//The device with which hunters mimic duck quacks
public class DuckCall implements Quackable {

	private QuackSubject subject;
	
	public DuckCall() {
		subject = new QuackSubject(this);
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
