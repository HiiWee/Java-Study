﻿package ex03_decoratePattern.ConcreteClassForB;

import ex03_decoratePattern.abstractClass.Beverage;

public class Decaf extends Beverage {
	
	public Decaf() {
		setDescription("De Caffein Coffee");
	}

	@Override
	public double cost() {
		return 1.05;
	}
	
}
