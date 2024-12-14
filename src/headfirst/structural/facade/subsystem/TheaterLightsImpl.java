package headfirst.structural.facade.subsystem;

public class TheaterLightsImpl implements TheaterLights {

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");	
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");			
	}

	@Override
	public void dim(int val) {
		System.out.println(this.getClass().getSimpleName() + " - dim to " + val);			
	}
	
}
