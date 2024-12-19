package extra.compound.ducks;

import extra.compound.behaviours.Quackable;

public class RedheadDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
