package forTask.week5;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while (true) {
			sum += i;

			if (sum >= n) {
				System.out.println(i);
				break;
			}
		
			i++;
		}
	}

}
