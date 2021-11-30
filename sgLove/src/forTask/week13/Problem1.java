package forTask.week13;

import java.util.Scanner;

class Grade {
	private int score;
	private char grade;

	public void setScore(int score) {
		this.score = score;
		calcGrade();
	}

	private void calcGrade() {
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
	}

	public void printGrade() {
		System.out.println(grade);
	}

}

public class Problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		Grade ob = new Grade();
		ob.setScore(score);
		ob.printGrade();
	}
}
