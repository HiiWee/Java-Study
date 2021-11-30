package ch09;

class Box10 {
	private int width;
	private int height;
	private int depth;
	private int volume;
	private long idNum;
	private static long boxID;

	public Box10(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		volume();
	}

	private void volume() {
		volume = width * height * depth;
	}

	public int getVolume() {
		return volume;
	}

	public static long getCurrentID() {
		return boxID;
	}
}

public class Ex09_07 {
	public static void main(String[] args) {
		Box10 ob;
		for (int i = 0; i < 5; i++) {
			ob = new Box10(i+1, i+2, i+3);
			System.out.println(ob.getVolume());
		}

		System.out.println("마지막으로 생성된 박스의 ID = " + Box10.getCurrentID());
	}
}
