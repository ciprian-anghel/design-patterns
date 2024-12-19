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
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
