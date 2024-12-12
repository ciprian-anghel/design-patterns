package headfirst.behavioral.observer.subjects;

import headfirst.behavioral.observer.observers.Observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
	
}
