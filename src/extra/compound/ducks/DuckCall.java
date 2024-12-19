package extra.compound.ducks;

import extra.compound.behaviours.Quackable;

//The device with which hunters mimic duck quacks
public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}

}
