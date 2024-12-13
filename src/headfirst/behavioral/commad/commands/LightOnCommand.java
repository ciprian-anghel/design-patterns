package headfirst.behavioral.commad.commands;

import headfirst.behavioral.commad.receivers.Light;

public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}

}
