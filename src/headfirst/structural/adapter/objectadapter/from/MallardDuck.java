package headfirst.structural.adapter.objectadapter.from;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack Quack!");
	}

	@Override
	public void fly() {
		System.out.println("Flies ayaw like a mallard!");
	}

}
