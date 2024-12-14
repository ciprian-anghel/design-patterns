package headfirst.structural.facade.subsystem;

public interface Amplifier {
	
	void on();
	void off();
	void setCd(CdPlayer cd);
	void setDvd(DvdPlayer dvd);
	void setStereoSound();
	void setSurroundSound();
	void setTunner(Tuner tuner);
	void setVolume(int vol);

}
