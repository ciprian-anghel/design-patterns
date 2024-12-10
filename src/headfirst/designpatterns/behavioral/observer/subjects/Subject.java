package headfirst.designpatterns.behavioral.observer.subjects;

import headfirst.designpatterns.behavioral.observer.observers.Observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
	
}
