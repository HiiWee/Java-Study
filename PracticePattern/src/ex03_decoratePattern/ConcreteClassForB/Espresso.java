package ex03_decoratePattern.ConcreteClassForB;

import ex03_decoratePattern.abstractClass.Beverage;

public class Espresso extends Beverage{

	public Espresso() {
		setDescription("Espresso Coffee!");
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
