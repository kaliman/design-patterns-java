package com.armana.behavioral.observer.observer.impl;

import com.armana.behavioral.observer.observer.DisplayElement;
import com.armana.behavioral.observer.observer.Observer;
import com.armana.behavioral.observer.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	@Override
	public void update() {
		this.lastPressure = currentPressure;
		this.currentPressure = weatherData.getPressure();
		display();
	}

	@Override
	public void display() {
		System.out.print("[Forecast] ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
