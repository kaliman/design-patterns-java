package com.armana.behavioral.strategy.ducks;

import com.armana.behavioral.strategy.Duck;
import com.armana.behavioral.strategy.behavior.impl.FlyNoWay;
import com.armana.behavioral.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
