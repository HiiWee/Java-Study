package forTask.week9;

class Box2 {
	int width = 10;
	int height = 20;
	int depth = 30;
}

public class Problem3 {
	public static void main(String[] args) {
		int myInt1 = 100;
		int myInt2 = myInt1;

		System.out.println("첫 번째 값 :" + myInt1 + "두 번째 값 : " + myInt2);

		myInt1 = 200;

		System.out.println("첫 번째 값 :" + myInt1 + "두 번째 값 : " + myInt2);

		Box2 myBox1 = new Box2();
		Box2 myBox2 = new Box2();

		myBox1.width = 20;
		myBox2.depth = 123;
		// print myBox1
		System.out.println("myBox1.width : " + myBox1.width);
		System.out.println("myBox1.height : " + myBox1.height);
		System.out.println("myBox1.depth : " + myBox1.depth);
		// print myBox2
		System.out.println("myBox2.width : " + myBox2.width);
		System.out.println("myBox2.height : " + myBox2.height);
		System.out.println("myBox2.depth : " + myBox2.depth);

		// myBox3가 myBox2를 참조함
		Box2 myBox3 = myBox2;

		myBox2.width = 1000;
		myBox2.height = 2000;

		// myBox2가 참조하는 객체의 속성값을 변경하면 myBox3가 참조하는 객체도 영향을 받음
		// 속성값이 변경 >> 즉 myBox2, myBox3모두 같은 객체를 참조하고 있기 때문이다.
		System.out.println("myBox3.width : " + myBox3.width);
		System.out.println("myBox3.height : " + myBox3.height);
		System.out.println("myBox3.depth : " + myBox3.depth);
	}
}
