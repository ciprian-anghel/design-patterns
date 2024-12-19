package extra.compound.composites;

import java.util.ArrayList;
import java.util.Iterator;

import extra.compound.behaviours.Quackable;

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
	
}	