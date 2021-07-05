package ch10;

class A {
	public int aa = 1;
	protected int aa2 = 4;

	public A() {
		System.out.println("A积己磊 角青");
	}
}

class B extends A {
	private int bb = 2;
	
	public int bb() {
		return bb;
	}
	
	public B() {
		System.out.println("B积己磊 角青");
	}
}

class C extends B {
	int cc = 3;
	
	public C() {
		System.out.println("C积己磊 角青");
	}
}

class D extends C {
	int dd = 4;

	public D() {
		System.out.println("D积己磊 角青");
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
