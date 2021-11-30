package ex03_decoratePattern.ConcreteClassForB;

import ex03_decoratePattern.abstractClass.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		setDescription("HouseBlend Coffee");
	}

	@Override
	public double cost() {
		return 0.89;
	}
	
}
