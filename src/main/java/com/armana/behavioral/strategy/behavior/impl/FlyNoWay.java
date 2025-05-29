package com.armana.behavioral.strategy.behavior.impl;

import com.armana.behavioral.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
