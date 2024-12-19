package extra.compound.observer;

public interface Subject {

	void addObserver(Observer observer);
	void notifyObservers();
	
}
