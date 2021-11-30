package ex01_strategyPattern.interfaceObj;

import ex01_strategyPattern.Interface.FlyBehavior;

public class flyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("Fly With Rocket Powered!!!");
	}

}
