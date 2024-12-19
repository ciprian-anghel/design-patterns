package extra.compound.adapters;

import extra.compound.behaviours.Quackable;
import extra.compound.geese.Goose;
import extra.compound.observer.Observer;
import extra.compound.observer.QuackerSubject;
import extra.compound.observer.Subject;

public class GooseAdapter implements Quackable {

	private Goose goose;
	private Subject subject;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.subject = new QuackerSubject(this);
	}
	
	@Override
	public void quack() {
		goose.honk();
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
