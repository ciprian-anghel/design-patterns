package headfirst.behavioral.commad.commands;

import headfirst.behavioral.commad.receivers.GarageDoor;

public class GarageCloseCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.closeGarage();
	}
	
	@Override
	public void undo() {
		garageDoor.openGarage();
	}

}
