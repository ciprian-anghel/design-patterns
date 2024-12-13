package headfirst.behavioral.commad.invokers;

import headfirst.behavioral.commad.commands.Command;
import headfirst.behavioral.commad.commands.MacroCommand;
import headfirst.behavioral.commad.commands.NoCommand;

/*
 * This is a remote with multiple slots for different appliances.
 * Each slot has an on and off button.
 */
public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	private Command[] macros;
	
	private final int slots = 3;
	private final int macroSlots = 2;
	
	public RemoteControl() {
		initializeEmptyButtons();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		if (slot > slots - 1) {
			return;
		}
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void setMacro(int macroSlot, Command[] commands) {
		if (macroSlot > 1) {
			return;
		}
		macros[macroSlot] = new MacroCommand(commands);
	}
	
	public void onButtonWasPusshed(int slot) {
		if (slot > slots - 1) {
			return;
		}
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPusshed(int slot) {
		if (slot > slots - 1) {
			return;
		}
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public void macroButtonWasPushed(int macroSlot) {
		if (macroSlot > macroSlots - 1) {
			return;
		}
		System.out.println("--- Macro starts --- ");
		macros[macroSlot].execute();
		System.out.println("--- Macro ends --- ");
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		buffer.append("----- Remote Control -----");
		buffer.append("\n");
		for (int i = 0; i < onCommands.length; i++) {
			buffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "   "
					+ offCommands[i].getClass().getSimpleName());
			buffer.append("\n");
		}
		buffer.append("[Bottom] <Undo>");
		buffer.append("   ");
		buffer.append("<Open garage macro>");
		buffer.append("   ");
		buffer.append("<Close garage macro>");
		buffer.append("\n");
		buffer.append("--------------------------");
		buffer.append("\n");
		return buffer.toString();
	}
	
	private void initializeEmptyButtons() {
		onCommands = new Command[slots];
		offCommands = new Command[slots];
		macros = new Command[macroSlots];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < slots; i++ ) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
		for (int i = 0; i < macros.length; i++ ) {
			macros[i] = noCommand;
		}
	}

}
