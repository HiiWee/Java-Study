package ch03;

public class Ex03_21 {
	public static void main(String[] args) {
		byte a = 20;
		double d = 3.14;
		boolean flag;

		flag = a > d;
		System.out.println(flag);
		
		flag = a == 20.0f;
		System.out.println(flag);
		
		flag = 10 != 10.0;
		System.out.println(flag);
		
		flag = 10 <= 20;
		System.out.println(flag);
		
		System.out.println(10<20);
		System.out.println(10>=20);
	}
}
