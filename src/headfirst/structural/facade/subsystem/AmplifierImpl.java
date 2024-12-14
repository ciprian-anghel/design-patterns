package headfirst.structural.facade.subsystem;

public class AmplifierImpl implements Amplifier {

	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	
	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");		
	}

	@Override
	public void setCd(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	@Override
	public void setDvd(DvdPlayer dvd) {
		this.dvdPlayer = dvd;
	}

	@Override
	public void setStereoSound() {
		System.out.println(this.getClass().getSimpleName() + " - stereo sound");		
	}

	@Override
	public void setSurroundSound() {
		System.out.println(this.getClass().getSimpleName() + " - surround sound");		
	}

	@Override
	public void setTunner(Tuner tuner) {
		this.tuner = tuner;
	}

	@Override
	public void setVolume(int vol) {
		System.out.println(this.getClass().getSimpleName() + " - set volume to " + vol);		
	}
	
}
