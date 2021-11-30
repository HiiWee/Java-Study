package Ch03;

public class Ex03_17 {
	public static void main(String[] args) {
		long l = 1234567890123456789L;
		float f = l;
		double d = l;
		System.out.println("원래의 long값 : " + l);
		System.out.println("long >> float로 변환 : " + (float)l);
		System.out.println("long >> double로 변환 : " + (double)l);
		long fl = (long)f;
		long dl = (long)d;
		System.out.println("long >> float >> long로 변환 : " + fl);
		System.out.println("long >> double >> long로 변환 : " + dl);
	}
}
