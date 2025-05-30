package com.armana.behavioral.strategy;

import com.armana.behavioral.strategy.behavior.impl.FlyRocketPowered;
import com.armana.behavioral.strategy.ducks.MallardDuck;
import com.armana.behavioral.strategy.ducks.ModelDuck;

/**
 * The App class contains the main method and demonstrates the use of the Strategy pattern
 * with the Duck superclass and its various implementations. It highlights dynamic behavior
 * changes at runtime by modifying the fly behavior of a duck.
 * <p>
 * This implementation involves:
 * - Creating instances of specific Duck subclasses: MallardDuck and ModelDuck.
 * - Demonstrating the existing flying and quacking behavior of each duck.
 * - Dynamically changing the fly behavior of a duck instance using the setFlyBehavior method.
 * <p>
 * The program shows how the Strategy design pattern enables flexible and reusable code by
 * encapsulating the behavior in separate concrete classes and allowing runtime modification
 * as needed.
 */
public class App {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		System.out.println("---");

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
