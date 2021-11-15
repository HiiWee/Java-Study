package com.anjinman.app.list;

import com.anjinman.app.entity.ExamEntity;
// 각 학생 데이터 객체를 리스트로 보관하기 위한 클래스
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

		//사이즈를 파악해 자리가 부족하면 늘린다.
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
