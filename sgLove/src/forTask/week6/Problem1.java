package forTask.week6;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			
			if (num % 5 == 0) {
				System.out.println(num);
				break;
			}
		}
	}

}
