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

		System.out.println("ù ��° �� :" + myInt1 + "�� ��° �� : " + myInt2);

		myInt1 = 200;

		System.out.println("ù ��° �� :" + myInt1 + "�� ��° �� : " + myInt2);

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

		// myBox3�� myBox2�� ������
		Box2 myBox3 = myBox2;

		myBox2.width = 1000;
		myBox2.height = 2000;

		// myBox2�� �����ϴ� ��ü�� �Ӽ����� �����ϸ� myBox3�� �����ϴ� ��ü�� ������ ����
		// �Ӽ����� ���� >> �� myBox2, myBox3��� ���� ��ü�� �����ϰ� �ֱ� �����̴�.
		System.out.println("myBox3.width : " + myBox3.width);
		System.out.println("myBox3.height : " + myBox3.height);
		System.out.println("myBox3.depth : " + myBox3.depth);
	}
}
