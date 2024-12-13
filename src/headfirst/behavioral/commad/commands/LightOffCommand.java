package headfirst.behavioral.commad.commands;

import headfirst.behavioral.commad.receivers.Light;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}
	
	@Override
	public void undo() {
		light.on();
	}

}
