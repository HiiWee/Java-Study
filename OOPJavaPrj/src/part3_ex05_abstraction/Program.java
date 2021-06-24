package part3_ex05_abstraction;

public class Program {
	public static void main(String[] args) {
		//NewlecExam exam = new NewlecExam();
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();
	}
}
