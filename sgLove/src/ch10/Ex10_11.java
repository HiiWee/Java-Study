package ch10;

class SD1 {
	public int i1;
	public double d1;
	public SD1(int i1) {
		System.out.println("SD1(int i1) ������ ����");
		this.i1 = i1 * i1;
		System.out.println(i1 + "�� 2������ : " + this.i1);
	}

	public SD1(double d1) {
		System.out.println("SD1(double d1) ������ ����");
		this.d1 = d1 * d1;
		System.out.println(i1 + "�� 2������ : " + this.d1);
	}
}

class Sub1 extends SD1{
	public Sub1(int i1) {
		super(i1);
		System.out.println("Sub1(int i1) ������ ����");
		this.i1 = i1 * i1 * i1;
		System.out.println(i1 + "�� 3������ : " + this.i1);
	}
	
	public Sub1(double d1) {
		super(d1);
		System.out.println("Sub1(double d1) ������ ����");
		this.d1 = d1 * d1 * d1;
		System.out.println(i1 + "�� 3������ : " + this.d1);
	}
}

public class Ex10_11 {

	public static void main(String[] args) {
		Sub1 ob1 = new Sub1(10);
		Sub1 ob2 = new Sub1(10.5);
	}

}
