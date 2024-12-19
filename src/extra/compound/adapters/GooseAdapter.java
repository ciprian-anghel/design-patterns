package extra.compound.adapters;

import extra.compound.behaviours.Quackable;
import extra.compound.geese.Goose;

public class GooseAdapter implements Quackable {

	private Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
	}
	
}
