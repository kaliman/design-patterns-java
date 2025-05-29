package com.armana.behavioral.strategy.behavior.impl;

import com.armana.behavioral.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}
