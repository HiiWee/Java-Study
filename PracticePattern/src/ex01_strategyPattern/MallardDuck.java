package ex01_strategyPattern;

import ex01_strategyPattern.interfaceObj.*;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("This is Mallard Duck");
	}
	
}
