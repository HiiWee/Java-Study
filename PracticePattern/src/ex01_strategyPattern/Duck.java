package ex01_strategyPattern;

import ex01_strategyPattern.Interface.*;
public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void swim() {
		System.out.println("Duck can swim");
	}
	
	public abstract void display();
	
}
