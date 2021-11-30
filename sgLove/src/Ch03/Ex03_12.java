package Ch03;

public class Ex03_12 {
	public static void main(String[] args) {
		double r = 5.0;
		double pi = 3.14159;
		
		System.out.printf("반지름이 %f인 원의 넓이는 %f입니다.\n", 5.0, 5.0*5.0*3.14159);
		System.out.printf("반지름이 %f인 원의 넓이는 %f입니다.\n", r, r*r*pi);
		System.out.printf("반지름이 %E인 원의 넓이는 %E입니다.\n", r, r*r*pi);

		System.out.printf("123.456을 %%f로 : %f\n", 123.456);
		System.out.printf("123.456을 %%e로 : %e\n", 123.456);
		System.out.printf("-123.456을 %%E로 : %E\n", -123.456);
	}
}
