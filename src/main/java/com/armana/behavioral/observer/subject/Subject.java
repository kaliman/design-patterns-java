package com.armana.behavioral.observer.subject;

import com.armana.behavioral.observer.observer.Observer;

public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
