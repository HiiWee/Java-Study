package ch10;

import java.util.Scanner;

class Ramen {
	private String ramyon = "���";
	private String water = "��";
	private String onion = "��";

	void boilWater() {
		System.out.println(water + "�� ���δ�");
	}

	void cooking() {
		System.out.println(ramyon + "�� " + onion + "�� �ְ� ���� �丮 �ϼ�");

	}
}

class RiceRamen extends Ramen {
	private String topp = "��";

	void topping() {
		System.out.println(topp + "�� �ִ´�.");
	}
}

class CheeseRamen extends Ramen {
	private String topp = "ġ��";

	void topping() {
		System.out.println(topp + "�� �ִ´�.");
	}
}

public class Ex10_01 {

	public static void main(String[] args) {
		int s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���!!(1:�Ϲݶ��, 2:�����, 3:ġ����, 99:����");
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
