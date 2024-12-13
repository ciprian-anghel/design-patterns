package headfirst.behavioral.commad.commands;

public class NoCommand implements Command {

	public NoCommand() {}
	
	@Override
	public void execute() {
		System.out.println("No command assigned");
	}
	
	@Override
	public void undo() {
		System.out.println("No command assigned");
	}

}
