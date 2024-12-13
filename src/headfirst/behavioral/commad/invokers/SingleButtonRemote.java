package headfirst.behavioral.commad.invokers;

import headfirst.behavioral.commad.commands.Command;

public class SingleButtonRemote {

	private Command slot;
	
	public SingleButtonRemote() {}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
}
