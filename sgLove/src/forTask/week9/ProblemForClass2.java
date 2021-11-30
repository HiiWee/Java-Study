package forTask.week9;

import java.util.Scanner;

public class ProblemForClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[11][11];
		int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
		int r, c;
		int count = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		r = scan.nextInt();
		c = scan.nextInt();
		
		if (arr[r][c] == 1) {
			System.out.println(-1);
		}
		else {
			for (int i = 0; i < 8; i++) {
				if (arr[r + dy[i]][c + dx[i]] == 1)
					count++;
			}
			System.out.println(count);
		}
	}
}
