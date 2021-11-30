package part3_ex05_abstraction;

public class ExamList {
	//배열을 대신하는 역할
	private Exam[] exams;
	private int current;
	
	//Aggregation Has a 관계
	//ExamList객체가 생성될때
	public ExamList() {
		exams = new Exam[3];
		current = 0;
	}
	
	/*
	public ExamList(int size) {
		this.exams = new Exam[size];
		this.current = 0;
	}
	 */

	
	public Exam get(int i) {
		return this.exams[i];
	}
	
	
	public void add(Exam exam) {
		// 객체의 직접적인 연산을 피하고 임시 변수를 사용하여 연산진행
		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			// 1. 크기가 5가 더 큰 새로운 배열 생성
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
				// 3. list.exams 가 새로만든 temp 배열을 참조한다.
				this.exams = temp;
			}
		}
		this.exams[this.current] = exam;
		this.current++;

	}
	

	public int getSize() {
		return current;
	}

}
