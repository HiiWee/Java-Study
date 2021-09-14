package Ch03;

public class Ex03_11 {
	public static void main(String[] args) {
		int price = -3000;
		int count = 9;
		
		System.out.printf("%d원 %d개를 사면 %d원입니다\n", 300, 9, 300*9);
		System.out.printf("%10d원 %10d개를 사면 %10d원입니다\n", price, count, price*count);
		System.out.printf("10진수 15를 16진수로 출력하면 : %x, 8진수로 출력하면 : %o\n", 15, 15);
		System.out.printf("음수갓 -10을 %%d로 출력하면 %d\n", -10);
		
	}
}
