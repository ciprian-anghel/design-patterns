package extra.compound.adapters;

import extra.compound.behaviours.Quackable;
import extra.compound.geese.Goose;
import extra.compound.observers.QuackSubject;
import extra.compound.observers.Observer;

public class GooseAdapter implements Quackable {

	private Goose goose;
	private QuackSubject observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new QuackSubject(this);
	}
	
	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		observable.addObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
}
