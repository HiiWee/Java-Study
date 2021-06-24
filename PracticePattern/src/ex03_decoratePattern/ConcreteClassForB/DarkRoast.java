package ex03_decoratePattern.ConcreteClassForB;

import ex03_decoratePattern.abstractClass.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		setDescription("Dark Roast Coffee");
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
	
}
