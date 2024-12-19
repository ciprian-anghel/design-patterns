package extra.compound.observer;

import java.util.ArrayList;

/*
 * Each individual duck is watched by observers.
 */
public class QuackerSubject implements Subject {

	private ArrayList<Observer> observers = new ArrayList<>();
	private Subject duck; 
	
	public QuackerSubject(Subject duck) {
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
