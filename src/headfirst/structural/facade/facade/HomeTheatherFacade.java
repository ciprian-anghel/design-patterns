package headfirst.structural.facade.facade;

import headfirst.structural.facade.subsystem.Amplifier;
import headfirst.structural.facade.subsystem.CdPlayer;
import headfirst.structural.facade.subsystem.DvdPlayer;
import headfirst.structural.facade.subsystem.PopcornPopper;
import headfirst.structural.facade.subsystem.Projector;
import headfirst.structural.facade.subsystem.Screen;
import headfirst.structural.facade.subsystem.TheaterLights;
import headfirst.structural.facade.subsystem.Tuner;

public class HomeTheatherFacade {
	
	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;
	
	public HomeTheatherFacade(Amplifier amp,
							  Tuner tuner,
							  DvdPlayer dvd,
							  CdPlayer cd,
							  Projector projector,
							  TheaterLights lights,
							  Screen screen,
							  PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.setTunner(tuner);
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
//	listenToCd();
//	endCd();
//	listenToRadio();
//	endRadio();
}
