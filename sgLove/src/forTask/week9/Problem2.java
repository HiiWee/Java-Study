package forTask.week9;

class Box {
	int width;
	int height;
	int depth;

	public Box() {
		this(0, 0, 0);
	}

	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

	public void volume() {
		int vol;
		vol = width * height * depth;
		System.out.println(vol);
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Box obj = new Box(10, 20, 30);

		obj.volume();
	}
}
