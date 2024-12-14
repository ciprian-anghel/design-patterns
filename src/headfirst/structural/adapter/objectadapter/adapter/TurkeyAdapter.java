package headfirst.structural.adapter.objectadapter.adapter;

import java.util.stream.IntStream;

import headfirst.structural.adapter.objectadapter.from.Duck;
import headfirst.structural.adapter.objectadapter.to.Turkey;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		//Turkeys cannot fly for long distances like ducks so it needs some breaks
		IntStream.range(0, 5)
				 .forEach(i -> turkey.fly());
	}
	
}
