package ex01_strategyPattern;

import ex01_strategyPattern.interfaceObj.*;
public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("This is Rubber Duck");
	}

		


}
