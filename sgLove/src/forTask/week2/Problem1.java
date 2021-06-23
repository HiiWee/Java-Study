package forTask.week2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		System.out.println(String.format("%d%d%02d", n1, n2, n3));
	}

}
