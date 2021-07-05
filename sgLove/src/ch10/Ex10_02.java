package ch10;

class A {
	public int aa = 1;
	protected int aa2 = 4;

	public A() {
		System.out.println("A������ ����");
	}
}

class B extends A {
	private int bb = 2;
	
	public int bb() {
		return bb;
	}
	
	public B() {
		System.out.println("B������ ����");
	}
}

class C extends B {
	int cc = 3;
	
	public C() {
		System.out.println("C������ ����");
	}
}

class D extends C {
	int dd = 4;

	public D() {
		System.out.println("D������ ����");
	}
}

public class Ex10_02 {

	public static void main(String[] args) {
		D ob = new D();
		
		System.out.println(ob.aa);
		System.out.println(ob.bb());
		System.out.println(ob.cc);
		System.out.println(ob.dd);
	}

}
