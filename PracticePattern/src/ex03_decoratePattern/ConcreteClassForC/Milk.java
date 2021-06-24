package ex03_decoratePattern.ConcreteClassForC;

import ex03_decoratePattern.abstractClass.*;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}
	
}
