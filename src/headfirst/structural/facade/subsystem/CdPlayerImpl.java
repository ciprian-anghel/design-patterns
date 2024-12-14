package headfirst.structural.facade.subsystem;

public class CdPlayerImpl implements CdPlayer {

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
		System.out.println(this.getClass().getSimpleName() + " - eject CD");
	}

	@Override
	public void pause() {
		System.out.println(this.getClass().getSimpleName() + " - pause");
	}

	@Override
	public void play() {
		System.out.println(this.getClass().getSimpleName() + " - play");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " - stop");		
	}

}
