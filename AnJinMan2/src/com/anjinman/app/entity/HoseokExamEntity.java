package com.anjinman.app.entity;


/* 
 * ExamEntity 객체의 추상 메소드를 구현 및 새로운 과목 computer 추가, getter setter 구현
 * */
public class HoseokExamEntity extends ExamEntity {
	private int computer;
	
	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public HoseokExamEntity() {
		super();
		this.computer = 0;
	}
	
	public HoseokExamEntity(int korean, int english, int math, int computer) {
		super(korean, english, math);
		this.computer = computer;
		
	}

	// onTotal()로 기존 국영수의 값을 쉽게 가져온다.
	@Override
	public int getTotal() {
		return onTotal() + this.computer;
	}

	@Override
	public float getAvg() {
		return getTotal()/4.0f;
	}
}
