package ch10;

import java.util.Scanner;

class Ramen {
	private String ramyon = "라면";
	private String water = "물";
	private String onion = "파";

	void boilWater() {
		System.out.println(water + "을 끓인다");
	}

	void cooking() {
		System.out.println(ramyon + "과 " + onion + "를 넣고 끓여 요리 완성");

	}
}

class RiceRamen extends Ramen {
	private String topp = "떡";

	void topping() {
		System.out.println(topp + "을 넣는다.");
	}
}

class CheeseRamen extends Ramen {
	private String topp = "치즈";

	void topping() {
		System.out.println(topp + "를 넣는다.");
	}
}

public class Ex10_01 {

	public static void main(String[] args) {
		int s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("만들고 싶은 요리를 입력하세요!!(1:일반라면, 2:떡라면, 3:치즈라면, 99:종료");
			s = scan.nextInt();
			if (s == 1) {
				Ramen r = new Ramen();
				r.boilWater();
				r.cooking();
			} else if (s == 2) {
				RiceRamen rr = new RiceRamen();
				rr.boilWater();
				rr.topping();
				rr.cooking();
			} else if (s == 3) {
				CheeseRamen cr = new CheeseRamen();
				cr.boilWater();
				cr.topping();
				cr.cooking();
			}
		} while (s != 99);
	}

}
