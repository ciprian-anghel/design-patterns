package extra.compound.observer;

public class QuackologistObserver implements Observer {

	@Override
	public void update(Subject duck) {
		System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked!");
	}

}
