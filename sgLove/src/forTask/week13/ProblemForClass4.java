package forTask.week13;

import java.util.Scanner;

class Search {
	private int[] ki;
	private int k, n;
	private int index;

	public void setArray(int[] ki, int n, int k) {
		this.ki = ki;
		this.k = k;
		this.n = n;
		
		searchIndex();
	}

	private void searchIndex() {
		for (int i = 0; i < n; i++) {
			if(ki[i] == k) {
				index = i+1;
				return;
			}
			index = -1;
		}
	}

	public int getIndex() {
		return index;
	}
}

public class ProblemForClass4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ki = new int[1000];
		int n = scan.nextInt();
		int k;

		for (int i = 0; i < n; i++) {
			ki[i] = scan.nextInt();
		}
		k = scan.nextInt();

		Search ob = new Search();
		ob.setArray(ki, n, k);
		System.out.println(ob.getIndex());
	}
}
