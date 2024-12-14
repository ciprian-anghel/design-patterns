package headfirst.structural.facade.subsystem;

public class ScreenImpl implements Screen {

	@Override
	public void up() {
		System.out.println(this.getClass().getSimpleName() + " - up");
	}

	@Override
	public void down() {
		System.out.println(this.getClass().getSimpleName() + " - down");		
	}

}
