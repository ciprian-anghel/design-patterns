package extra.compound.observers;

/*
 * Interface which should be implemented if object needs to be observed. See Quackable
 */
public interface Subject {

	void addObserver(Observer observer);
	void notifyObservers();
}
