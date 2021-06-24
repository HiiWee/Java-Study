package ch03;

import java.util.Scanner;

public class Ex03_24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a = " + a + "(" + Integer.toBinaryString(a) + ")");
		System.out.println("b = " + b + "(" + Integer.toBinaryString(b) + ")");

		System.out.println("a << 2= " + (a<<2) + "(" + Integer.toBinaryString(a<<2) + ")");
		System.out.println("a >> 2= " + (a>>2) + "(" + Integer.toBinaryString(a>>2) + ")");

		System.out.println("b << 2 " + (b<<2) + "(" + Integer.toBinaryString(b<<2) + ")");
		System.out.println("b >> 2 " + (b>>2) + "(" + Integer.toBinaryString(b>>2) + ")");
		System.out.println("b >>> 2 " + (b>>>2) + "(" + Integer.toBinaryString(b>>>2) + ")");
	}
}
