package ch08;

class Box3 {
	int w;
	int h;
	int d;
	long idNum;
	static long boxID=0;
	public Box3() {
		idNum = ++boxID;
	}
}

public class Ex08_04 {
	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();
		
		System.out.println("mybox1's id num : " + mybox1.idNum);
		System.out.println("mybox2's id num : " + mybox2.idNum);
		System.out.println("mybox3's id num : " + mybox3.idNum);
		System.out.println("mybox4's id num : " + mybox4.idNum);
		System.out.println("the last number of box " + Box3.boxID);
	}

}
