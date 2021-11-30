package forTask.week3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int year, month, day;
		
		Scanner scan = new Scanner(System.in);
		
		year = scan.nextInt();
		month = scan.nextInt();
		day = scan.nextInt();
		
		System.out.printf("%02d-%02d-%04d", day, month, year);
	}

}
