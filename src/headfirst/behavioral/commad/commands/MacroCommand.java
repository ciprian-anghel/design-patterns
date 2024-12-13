package headfirst.behavioral.commad.commands;

public class MacroCommand implements Command {
	
	private Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for(int i = 0; i < commands.length; i++) {
			if (commands[i] == null) {
				continue;
			}
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		System.out.println("Undo for macros might lead to security breaches, do not use!");
	}

}
