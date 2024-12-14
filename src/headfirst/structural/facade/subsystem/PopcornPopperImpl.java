package headfirst.structural.facade.subsystem;

public class PopcornPopperImpl implements PopcornPopper {

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");		
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");		
	}

	@Override
	public void pop() {
		System.out.println(this.getClass().getSimpleName() + " - pop");		
	}

}
