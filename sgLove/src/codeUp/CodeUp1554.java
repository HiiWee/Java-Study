package codeUp;

import java.util.Scanner;

class Flooring {
	private double x;
	private int flooringX;

	public Flooring(double x) {
		this.x = x;
		
		setFlooring();
	}

	private void setFlooring() {
		if (x == 0)
			flooringX = 0;
		else {
			if(x > 0)
				flooringX = (int)x;
			else
				flooringX = (int)x - 1;
		}
	}
	
	public int getFlooring() {
		return flooringX;
	}
}

public class CodeUp1554 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		
		Flooring ob = new Flooring(x);
		System.out.println(ob.getFlooring());

	}
}
