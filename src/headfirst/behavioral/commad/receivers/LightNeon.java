package headfirst.behavioral.commad.receivers;

public class LightNeon implements Light {

	@Override
	public void on() {
		System.out.println("Neon light - on");
	}

	@Override
	public void off() {
		System.out.println("Neon light - off");		
	}

}
