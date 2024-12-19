package extra.compound;

import extra.compound.adapters.GooseAdapter;
import extra.compound.behaviours.Quackable;
import extra.compound.composites.Flock;
import extra.compound.decorators.QuackCounter;
import extra.compound.factories.AbstractDuckFactory;
import extra.compound.factories.CountingDuckFactory;
import extra.compound.geese.Goose;

//page 524

public class DuckSimulatorMain {

	public static void main(String[] args) {
		
		DuckSimulatorMain simulator = new DuckSimulatorMain();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
		
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose()); //we do not want this one counted with the QuackCounter
		
		System.out.println("\nDuck Simulator");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulator");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulator");
		simulate(flockOfMallards);
		
		System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
