package extra.compound.composites;

import java.util.ArrayList;
import java.util.Iterator;

import extra.compound.behaviours.Quackable;
import extra.compound.observer.Observer;

public class Flock implements Quackable {

	private ArrayList<Quackable> quackers = new ArrayList<>();
	
	public void add(Quackable quacker) {
		this.quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void addObserver(Observer observer) {
		quackers.forEach(q -> q.addObserver(observer));
	}

	@Override
	public void notifyObservers() {
	}

}	