package forTask.week6;

import java.util.Scanner;

public class ProblemForClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			if ((i+1) % 3 == 0)
				continue;
			System.out.print(i + 1 + " ");
		}
	}
}
