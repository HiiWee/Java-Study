package part3_ex04_seperateUIcode;

public class ExamList {
	//�迭�� ����ϴ� ����
	private Exam[] exams;
	private int current;
	
	//Aggregation Has a ����
	//ExamList��ü�� �����ɶ�
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
		// ��ü�� �������� ������ ���ϰ� �ӽ� ������ ����Ͽ� ��������
		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� �� ū ���ο� �迭 ����
			Exam[] temp = new Exam[size + 5];
			// 2. ���� ���ֽ�Ű��
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
				// 3. list.exams �� ���θ��� temp �迭�� �����Ѵ�.
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
