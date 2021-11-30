package com.anjinman.app.entity;

// 실질적인 학생들의 데이터를 저장하고 관리하는 부분
/* 다른 서비스에서 재사용하기 위해 객체로 생성되서 동작하는 부분은
 * 추상화를 통해(getTotal(), getAvg()) 자식 객체에게 맡김
 *  */
public abstract class ExamEntity {
	private int korean;
	private int english;
	private int math;
	
	public ExamEntity() {
		this(0, 0, 0);
	}
	
	public ExamEntity(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	abstract public int getTotal();
	
	abstract public float getAvg();
	
	
	// 자식에게만 공개되는 기존 국, 영, 수의 점수의 합을 반환
	protected int onTotal() {
		return korean + english + math;
	}
	
	
}
