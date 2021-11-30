package com.anjinman.app.list;

import com.anjinman.app.entity.ExamEntity;
// 리스트 단위로 ExamEntity객체를 관리한다.
// 리스트들을 관리하기 위한 메소드들이 있음
// 일반적으로 리스트는 데이터를 저장하는 객체를 사용하고 있지는 않다.
// 단순하게 저장을하고 필요하면 저장한 객체를 꺼내서 반환하는 역할만 함
// ExamEntity()객체를 aggregation has a 관계로 포함하고 있다.

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
