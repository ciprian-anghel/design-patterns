package headfirst.designpatterns.behavioral.observer.subjects;

import java.util.ArrayList;

import headfirst.designpatterns.behavioral.observer.observers.Observer;

public class WeatherData implements Subject {
	
	private final ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observers.stream().forEach(o -> 
			o.update(temperature, humidity, pressure)
		);
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
