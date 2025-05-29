package com.armana.behavioral.strategy.behavior.impl;

import com.armana.behavioral.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
