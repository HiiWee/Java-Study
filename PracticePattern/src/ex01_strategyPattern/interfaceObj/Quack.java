package ex01_strategyPattern.interfaceObj;

import ex01_strategyPattern.Interface.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack Quack!!");
	}
}
