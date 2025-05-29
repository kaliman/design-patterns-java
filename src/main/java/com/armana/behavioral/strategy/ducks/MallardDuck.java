package com.armana.behavioral.strategy.ducks;

import com.armana.behavioral.strategy.Duck;
import com.armana.behavioral.strategy.behavior.impl.FlyWithWings;
import com.armana.behavioral.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}
}
