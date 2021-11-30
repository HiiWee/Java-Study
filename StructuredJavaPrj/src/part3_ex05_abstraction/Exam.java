package part3_ex05_abstraction;

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	
	//코드의 집중화
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//getter and setter
	public int getKor() {
		
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public abstract int getTotal();
	
	//자식에게만 공개되는 메소드
	//자식 클래스에서 getTotal()을 처음부터 구현하는것에 대한
	//부담을 줄일 수 있다.
	protected int onTotal() {
		return kor + eng + math;
	}

	public abstract float getAvg();
	
}
