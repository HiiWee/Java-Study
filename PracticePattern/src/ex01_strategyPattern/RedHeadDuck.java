package ex01_strategyPattern;

import ex01_strategyPattern.interfaceObj.*;
public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("This is Read Head Duck");
	}

}
