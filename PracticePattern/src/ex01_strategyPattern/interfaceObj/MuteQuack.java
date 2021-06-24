package ex01_strategyPattern.interfaceObj;

import ex01_strategyPattern.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println(" ... ");
	}
}
