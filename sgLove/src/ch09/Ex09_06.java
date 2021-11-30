package ch09;

class Box {
	private int width;
	private int height;
	private int depth;
	private int volume;

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		volume();
	}

	private void volume() {
		volume = width * height * depth;
	}

	public int getVolume() {
		return volume;
	}
}

public class Ex09_06 {
	public static void main(String[] args) {
		Box ob = new Box(10, 20, 30);
		System.out.println(ob.getVolume());
	}
}
