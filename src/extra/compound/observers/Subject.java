package extra.compound.observers;

public interface Subject {

	void addObserver(Observer observer);
	void notifyObservers();
}
