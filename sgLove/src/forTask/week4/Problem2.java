package forTask.week4;

import java.util.Scanner;
//날짜입력 판단
public class Problem2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year, month, day;

		year = scan.nextInt();
		month = scan.nextInt();
		day = scan.nextInt();

		int total = year - month + day;

		if (total % 10 == 0)

			System.out.println("대박");
		else
			System.out.println("그럭저럭");

	}

}
