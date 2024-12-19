package extra.compound.observers;

import java.util.ArrayList;
import java.util.Iterator;

public class QuackSubject implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<>();
	private Subject duck;
	
	public QuackSubject(Subject duck) {
		this.duck = duck;
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(o -> o.update(duck));
	}

}
