package codeUp;

import java.util.Scanner;

class Ceiling {
	private double x;
	private int ceilingX;

	public Ceiling(double x) {
		this.x = x;

		calcCeiling();
	}

	private void calcCeiling() {
		if (x == 0)
			ceilingX = 0;
		else {
			if ((int) x >= x)
				ceilingX = (int) x;
			else
				ceilingX = (int) x + 1;
		}
	}

	public int getCeiling() {
		return ceilingX;
	}
}

public class CodeUp1553 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		Ceiling ob = new Ceiling(x);
		System.out.println(ob.getCeiling());
	}
}
