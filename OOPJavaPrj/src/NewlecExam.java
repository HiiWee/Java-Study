import part3_ex04_seperateUIcode.Exam;
//is a ���
public class NewlecExam extends Exam{
	private int com;
	
	public NewlecExam() {
		this(0, 0, 0, 0);
	}
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);	//�θ��� ������ ȣ��
		this.com = com;
	}
	

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	 
	@Override
	public int getTotal() {
		//�θ�ü getTotal + com
		return super.getTotal() + com;
	}
	
	@Override
	public float getAvg() {
		return getTotal()/4.0f;
	}
}
