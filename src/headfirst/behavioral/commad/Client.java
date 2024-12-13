package headfirst.behavioral.commad;

import headfirst.behavioral.commad.commands.Command;
import headfirst.behavioral.commad.commands.GarageCloseCommand;
import headfirst.behavioral.commad.commands.GarageOpenCommand;
import headfirst.behavioral.commad.commands.LightOffCommand;
import headfirst.behavioral.commad.commands.LightOnCommand;
import headfirst.behavioral.commad.invokers.RemoteControl;
import headfirst.behavioral.commad.invokers.SingleButtonRemote;
import headfirst.behavioral.commad.receivers.GarageDoor;
import headfirst.behavioral.commad.receivers.Light;
import headfirst.behavioral.commad.receivers.LightNeon;

public class Client {

	public static void main(String[] args) {
//		testSingleButtonRemote();
		testMultipleApplicancesRemote();
	}
	
	private static void testMultipleApplicancesRemote() {
		Light light = new LightNeon();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		GarageDoor door = new GarageDoor();
		GarageOpenCommand garageOpen = new GarageOpenCommand(door);
		GarageCloseCommand garageClose = new GarageCloseCommand(door);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageOpen, garageClose);
		Command[] openGarageMacro = {garageOpen, lightOn, garageClose};
		remote.setMacro(0, openGarageMacro);
		Command[] closeGarageMacro = {garageClose, lightOff};
		remote.setMacro(1, closeGarageMacro);
		
		//Display remote
		System.out.println(remote);
		
		remote.onButtonWasPusshed(1);
		remote.undoButtonWasPushed();
		remote.onButtonWasPusshed(0);
		remote.onButtonWasPusshed(1);
		remote.offButtonWasPusshed(0);
		remote.undoButtonWasPushed();

		remote.macroButtonWasPushed(0);
		remote.macroButtonWasPushed(1);

	}
	
	private static void testSingleButtonRemote() {
		SingleButtonRemote remote = new SingleButtonRemote();
		
		//Assign button to lighOn command
		Light light = new LightNeon();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		//Assign button to close door command
		GarageDoor door = new GarageDoor();
		GarageCloseCommand garageClose = new GarageCloseCommand(door);
		remote.setCommand(garageClose);
		remote.buttonWasPressed();
		
		//Assign button to open door command
		GarageOpenCommand garageOpen = new GarageOpenCommand(door);
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
	
}
