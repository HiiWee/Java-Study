package forTask.week4;

import java.util.Scanner;
//슬기의 체육시간 공던지기
public class Problem4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int meter;

		meter = scan.nextInt();

		if ((meter >= 30 && meter <= 40) || (meter >= 60 && meter <= 70))
			System.out.println("win");
		else
			System.out.println("lose");
	}

}
