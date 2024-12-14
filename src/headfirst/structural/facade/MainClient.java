package headfirst.structural.facade;

import headfirst.structural.facade.facade.HomeTheatherFacade;
import headfirst.structural.facade.subsystem.Amplifier;
import headfirst.structural.facade.subsystem.AmplifierImpl;
import headfirst.structural.facade.subsystem.CdPlayer;
import headfirst.structural.facade.subsystem.CdPlayerImpl;
import headfirst.structural.facade.subsystem.DvdPlayer;
import headfirst.structural.facade.subsystem.DvdPlayerImpl;
import headfirst.structural.facade.subsystem.PopcornPopper;
import headfirst.structural.facade.subsystem.PopcornPopperImpl;
import headfirst.structural.facade.subsystem.Projector;
import headfirst.structural.facade.subsystem.ProjectorImpl;
import headfirst.structural.facade.subsystem.Screen;
import headfirst.structural.facade.subsystem.ScreenImpl;
import headfirst.structural.facade.subsystem.TheaterLights;
import headfirst.structural.facade.subsystem.TheaterLightsImpl;
import headfirst.structural.facade.subsystem.Tuner;
import headfirst.structural.facade.subsystem.TunerImpl;

public class MainClient {
	public static void main(String[] args) {
		
		Amplifier amp = new AmplifierImpl();
		Tuner tuner = new TunerImpl();
		DvdPlayer dvd = new DvdPlayerImpl();
		CdPlayer cd = new CdPlayerImpl();
		Projector projector = new ProjectorImpl();
		TheaterLights lights = new TheaterLightsImpl();
		Screen screen = new ScreenImpl();
		PopcornPopper popper = new PopcornPopperImpl();
		
		HomeTheatherFacade homeTheater = new HomeTheatherFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
