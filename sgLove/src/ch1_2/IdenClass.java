package ch1_2;

import java.util.Scanner;

public class IdenClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�б��� �Է��Ͻÿ�. ");
		String univ = scan.next();
		System.out.println("");
		
		System.out.print("�а��� �Է��Ͻÿ�. ");
		String major = scan.next();
		System.out.println("");
		
		System.out.print("�й��� �Է��Ͻÿ�. ");
		int studentID = scan.nextInt();
		System.out.println("");
		
		System.out.print("�̸��� �Է��Ͻÿ�. ");
		String name = scan.next();
		System.out.println("");
		
		System.out.print("���̸� �Է��Ͻÿ�. ");
		int age = scan.nextInt();
		System.out.println("");
		
		System.out.println("�̸�: " + univ);
		System.out.println("�а�: " + major);
		System.out.println("�й�: " + studentID);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
}