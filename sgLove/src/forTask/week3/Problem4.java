package forTask.week3;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		int a, b;
		boolean f;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		f = !(a != b);
		System.out.println(f);
	}

}
