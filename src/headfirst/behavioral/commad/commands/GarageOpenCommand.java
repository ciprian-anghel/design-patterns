package headfirst.behavioral.commad.commands;

import headfirst.behavioral.commad.receivers.GarageDoor;

public class GarageOpenCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.openGarage();
	}
	
	@Override
	public void undo() {
		garageDoor.closeGarage();
	}

}
