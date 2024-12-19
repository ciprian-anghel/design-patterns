package extra.compound.ducks;

import extra.compound.behaviours.Quackable;

public class RubberDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squack");
	}
	
}
