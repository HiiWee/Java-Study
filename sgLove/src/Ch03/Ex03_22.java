package Ch03;

public class Ex03_22 {
	public static void main(String[] args) {
		boolean a;
		
		a = (20 > 10 || 30 > 40);
		System.out.println(a);
		
		a = (20 > 10 && 30 > 40);
		System.out.println(a);
		
		a = !true;
		System.out.println(a);
		
		System.out.println(20 > 10 || 30 > 40);
		System.out.println(20 > 10 && 30 > 40);
		System.out.println(!true);
	}
}
