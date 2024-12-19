package extra.compound.factories;

import extra.compound.behaviours.Quackable;
import extra.compound.decorators.QuackCounter;
import extra.compound.ducks.DuckCall;
import extra.compound.ducks.MallardDuck;
import extra.compound.ducks.RedheadDuck;
import extra.compound.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
