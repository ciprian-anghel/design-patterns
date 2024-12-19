package extra.compound.factories;

import extra.compound.behaviours.Quackable;

//We used this to make sure that we have related objects created,
//such as ducks without or with counter
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	
}
