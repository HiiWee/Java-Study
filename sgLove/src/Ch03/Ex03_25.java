package Ch03;

import java.util.Scanner;

public class Ex03_25 {
	public static void main(String[] args) {
		int a = 10;
		boolean b = false;
		System.out.println("a = " + a);
		
		System.out.println("a += 4�� ��� " + (a += 4));
		System.out.println("a %= 4�� ��� " + (a %= 4));
		System.out.println("a <<= 4�� ��� " + (a <<= 4));
		System.out.println("b &= a>2�� ��� " + (b &= a>2));
		System.out.println("b |= a>2�� ��� " + (b |= a>2));
		
	}
}
