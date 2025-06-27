package com.armana.behavioral.observer.observer;

public interface Observer {
	// Push data to observers
	void update(float temperature, float humidity, float pressure);

	// Pull data from Subject when needed
	void update();
}
