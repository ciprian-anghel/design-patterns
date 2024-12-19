package extra.compound.ducks;

import extra.compound.behaviours.Quackable;
import extra.compound.observers.QuackSubject;
import extra.compound.observers.Observer;

public class RedheadDuck implements Quackable {

	private QuackSubject subject;
	
	public RedheadDuck() {
		this.subject = new QuackSubject(this);
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
