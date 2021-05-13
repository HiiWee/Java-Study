package part3_ex04_seperateUIcode;

public class Exam {
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

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAvg() {
		return this.getTotal()/3.0f;
	}
	
}
