package ex01_strategyPattern.interfaceObj;

import ex01_strategyPattern.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
	public void fly() {
		System.out.println("This duck can fly!");
	}
}
