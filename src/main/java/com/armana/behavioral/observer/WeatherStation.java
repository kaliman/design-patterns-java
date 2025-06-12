package com.armana.behavioral.observer;

import com.armana.behavioral.observer.observer.impl.CurrentConditionDisplay;
import com.armana.behavioral.observer.observer.impl.ForecastDisplay;
import com.armana.behavioral.observer.observer.impl.HeatIndexDisplay;
import com.armana.behavioral.observer.observer.impl.StatisticsDisplay;
import com.armana.behavioral.observer.subject.impl.WeatherData;

/**
 * The WeatherStation class serves as the main driver for a weather monitoring system
 * based on the Observer Design Pattern. It initializes and connects weather data
 * with various display components allowing real-time updates to multiple observers
 * whenever the weather measurements change.
 * <p>
 * The WeatherStation is responsible for:
 * - Creating an instance of WeatherData to act as the subject of observation.
 * - Registering multiple observer implementations such as
 * CurrentConditionDisplay, StatisticsDisplay, ForecastDisplay, and HeatIndexDisplay.
 * - Simulating changes in weather measurements by setting temperature, humidity,
 * and pressure values in WeatherData, which subsequently triggers updates
 * to all registered observers.
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("================================================");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("================================================");
		weatherData.setMeasurements(78, 90, 29.2f);
		System.out.println("================================================");
		weatherData.setMeasurements(80, 70, 29.2f);
	}
}
