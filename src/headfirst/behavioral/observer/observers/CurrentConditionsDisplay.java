package headfirst.behavioral.observer.observers;

import headfirst.behavioral.observer.DisplayElement;
import headfirst.behavioral.observer.subjects.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println(String.format("Current conditions: %.1fF degrees and %.1f%% humidity.", 
				this.temperature, this.humidity));
	}

}
