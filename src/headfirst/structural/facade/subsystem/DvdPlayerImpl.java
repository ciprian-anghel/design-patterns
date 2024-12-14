package headfirst.structural.facade.subsystem;

public class DvdPlayerImpl implements DvdPlayer {

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");
	}

	@Override
	public void eject() {
		System.out.println(this.getClass().getSimpleName() + " - eject");
	}

	@Override
	public void pause() {
		System.out.println(this.getClass().getSimpleName() + " - pause");
	}

	@Override
	public void play(String movie) {
		System.out.println(this.getClass().getSimpleName() + " - play " + movie);		
	}

	@Override
	public void setSurroundSound() {
		System.out.println(this.getClass().getSimpleName() + " - set surround");		
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " - stop");		
	}

}
