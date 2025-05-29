package com.armana.behavioral.strategy.behavior.impl;

import com.armana.behavioral.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
