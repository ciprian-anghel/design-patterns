package extra.compound.factories;

import extra.compound.behaviours.Quackable;
import extra.compound.ducks.DuckCall;
import extra.compound.ducks.MallardDuck;
import extra.compound.ducks.RedheadDuck;
import extra.compound.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
