package headfirst.structural.facade.subsystem;

public interface DvdPlayer {

	void on();
	void off();
	void eject();
	void pause();
	void play(String movie);
	void setSurroundSound();
	void stop();
	
}
