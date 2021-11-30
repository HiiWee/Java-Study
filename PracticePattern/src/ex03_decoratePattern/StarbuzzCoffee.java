package ex03_decoratePattern;

import ex03_decoratePattern.abstractClass.*;
import ex03_decoratePattern.ConcreteClassForB.*;
import ex03_decoratePattern.ConcreteClassForC.*;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Milk(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
	}

}
