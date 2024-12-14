package headfirst.structural.facade.subsystem;

public class TunerImpl implements Tuner {
	
	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " - on");	
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " - off");
	}

	@Override
	public void setAlarm() {
		System.out.println(this.getClass().getSimpleName() + " - set alarm");
	}

	@Override
	public void setFm() {
		System.out.println(this.getClass().getSimpleName() + " - set fm");
	}

	@Override
	public void setFrequency() {
		System.out.println(this.getClass().getSimpleName() + " - set frequency");		
	}

}
