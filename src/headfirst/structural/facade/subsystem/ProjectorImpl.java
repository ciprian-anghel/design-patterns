package headfirst.structural.facade.subsystem;

public class ProjectorImpl implements Projector {

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");		
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");		
	}

	@Override
	public void tvMode() {
		System.out.println(this.getClass().getSimpleName() + " - tv mode");		
	}

	@Override
	public void wideScreenMode() {
		System.out.println(this.getClass().getSimpleName() + " - wide screen mode");		
	}

}
