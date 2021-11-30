package ex10.control2.for_example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		
		/* 수학을 못할 경울 발생할 수 있는 상황
		 * for(int i=0; i<5; i++) { total += i+3; }
		 */
		// n*(a+1)/2
		total = 5*(3+7)/2;
		System.out.printf("total is %d\n", total);
	}
}