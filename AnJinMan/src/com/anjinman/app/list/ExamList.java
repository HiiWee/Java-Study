package com.anjinman.app.list;

import com.anjinman.app.entity.ExamEntity;
<<<<<<< HEAD
// ����Ʈ ������ ExamEntity��ü�� �����Ѵ�.
// ����Ʈ���� �����ϱ� ���� �޼ҵ���� ����
// �Ϲ������� ����Ʈ�� �����͸� �����ϴ� ��ü�� ����ϰ� ������ �ʴ�.
// �ܼ��ϰ� �������ϰ� �ʿ��ϸ� ������ ��ü�� ������ ��ȯ�ϴ� ���Ҹ� ��
// ExamEntity()��ü�� aggregation has a ����� �����ϰ� �ִ�.
=======
// �� �л� ������ ��ü�� ����Ʈ�� �����ϱ� ���� Ŭ����
>>>>>>> 03612ae5f0c516db5dd6820c650f2fdcfa073db0
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
