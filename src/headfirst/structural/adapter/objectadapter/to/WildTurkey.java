package headfirst.structural.adapter.objectadapter.to;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble Gobble!");
	}

	@Override
	public void fly() {
		System.out.println("Flies ayaw like a turkey!");
	}

}
