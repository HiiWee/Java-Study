package forTask.week5;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		
		while (true) {
			n = n/10;
			if(n==0) {
				count++;
				break;
			}
			else
				count++;
		}
		System.out.println(count);
	}

}
