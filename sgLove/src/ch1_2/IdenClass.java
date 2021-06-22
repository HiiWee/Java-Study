package ch1_2;

import java.util.Scanner;

public class IdenClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("학교를 입력하시오. ");
		String univ = scan.next();
		System.out.println("");
		
		System.out.print("학과를 입력하시오. ");
		String major = scan.next();
		System.out.println("");
		
		System.out.print("학번을 입력하시오. ");
		int studentID = scan.nextInt();
		System.out.println("");
		
		System.out.print("이름을 입력하시오. ");
		String name = scan.next();
		System.out.println("");
		
		System.out.print("나이를 입력하시오. ");
		int age = scan.nextInt();
		System.out.println("");
		
		System.out.println("이름: " + univ);
		System.out.println("학과: " + major);
		System.out.println("학번: " + studentID);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}