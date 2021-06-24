package forTask.week3;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		int n1, n2;
		
		Scanner scan = new Scanner(System.in);
		
		n1 = scan.nextByte();
		n2 = scan.nextByte();
		
		int result = n1 ^ n2;
		
		System.out.println(result);
	}

}
