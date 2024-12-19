package extra.compound.ducks;

import extra.compound.behaviours.Quackable;

public class MallardDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
