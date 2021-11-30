package forTask.week3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		int n1, n2, n3;
		
		Scanner scan = new Scanner(System.in);
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		int sum = n1 + n2 + n3;
		double avg = sum/3.0;
		
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}

}
