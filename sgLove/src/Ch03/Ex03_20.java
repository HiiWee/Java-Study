package Ch03;

public class Ex03_20 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("++a + ++a�� ����� : " + (++a + ++a)); //23
		a = 10;

		System.out.println("++a - ++a�� ����� : " + (++a - ++a)); // -1
		a = 10;
		
		System.out.println("a++ + a++�� ����� : " + (a++ + a++)); // 21
		a = 10;
		
		System.out.println("a++ - a++�� ����� : " + (a++ - a++)); // -1
		a = 10;
		
		System.out.println("++a + a++�� ����� : " + (++a + a++)); // 22
		a = 10;
		
		System.out.println("++a - a++�� ����� : " + (++a - a++)); // 0
		a = 10;
		
		System.out.println("a++ + ++a�� ����� : " + (a++ + ++a)); // 22
		a = 10;
		
		System.out.println("a++ - ++a�� ����� : " + (a++ - ++a)); // -2
		a = 10;
	}
}
