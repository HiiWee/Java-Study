package ch05;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dan = 2;
		int j = 1;
		while (j <= 9) {

			dan = 2;
			while (dan <= 9) {
				System.out.print(dan + "*" + j + "=" + dan * j + '\t');
				dan++;
			}
			System.out.println("");
			j++;
		}

	}

}
