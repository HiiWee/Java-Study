package ex01_strategyPattern;

import ex01_strategyPattern.interfaceObj.*;

public class DuckSimulator {

	public static void main(String[] args) {
		
		//Mallard Duck Simulate
		Duck whatDuck = new MallardDuck();
		whatDuck.display();
		whatDuck.swim();
		whatDuck.performFly();
		whatDuck.performQuack();
		
		System.out.println("");
		
		//Read Head Duck Simulate
		whatDuck = new RedHeadDuck();
		whatDuck.display();
		whatDuck.swim();
		whatDuck.performFly();
		whatDuck.performQuack();

		System.out.println("");

		//Rubber Duck Simulate
		whatDuck = new RubberDuck();
		whatDuck.display();
		whatDuck.swim();
		whatDuck.performFly();
		whatDuck.setFlyBehavior(new flyRocketPowered());
		whatDuck.performFly();
		whatDuck.performQuack();
		
	}

}
