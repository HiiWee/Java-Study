package forTask.week5;

import java.util.Scanner;

//정수의 양,음수 및 홀수, 짝수 판별
public class ProblemForClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n) {
			if(i % 10 == 1) count++;
			i++;
		}
		System.out.println("number of 1 = " + count);
	}

}
