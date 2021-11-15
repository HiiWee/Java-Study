package com.anjinman.app.list;

import com.anjinman.app.entity.ExamEntity;
// �� �л� ������ ��ü�� ����Ʈ�� �����ϱ� ���� Ŭ����
public class ExamList {
	private ExamEntity[] exams;
	private int current;

	public ExamList() {
		exams = new ExamEntity[3];
		current = 0;
	}

	public void add(ExamEntity exam) {
		ExamEntity[] exams = this.exams;
		int size = this.current;

		//����� �ľ��� �ڸ��� �����ϸ� �ø���.
		if (exams.length == size) {
			ExamEntity[] temp = new ExamEntity[size + 3];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
				this.exams = temp;
			}
		}
		this.exams[this.current] = exam;
		this.current++;
	}
	
	public ExamEntity getEntity(int size) {
		return this.exams[size];
	}

	public int getSize() {
		return current;
	}
	
}
