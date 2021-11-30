package forTask.week9;

class Calculator {
	private int op1;
	private int op2;

	public Calculator() {
		this(0, 0);
	}

	public Calculator(int x, int y) {
		op1 = x;
		op2 = y;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public int getOp1() {
		return op1;
	}

	public int getOp2() {
		return op2;
	}

	public String sumNum() {
		int sum = getOp1() + getOp2();
		return "op1 + op2 = " + sum;
	}

	public String subNum() {
		int sub = getOp1() - getOp2();
		return "op1 - op2 = " + sub;
	}

	public String mulNum() {
		int mul = getOp1() * getOp2();
		return "op1 * op2 = " + mul;
	}

	public String divNum() {
		int div = getOp1() / getOp2();
		return "op1 / op2 = " + div;
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// op1의 값 초기화
		calc.setOp1(10);
		// op2의 값 초기화
		calc.setOp2(5);

		// op1 == 10, op2 == 5 (op1, op2는 Calculator클래스의 멤버변수)

		// 덧셈출력
		System.out.println(calc.sumNum());
		// 뺄셈출력
		System.out.println(calc.subNum());
		// 곱셈출력
		System.out.println(calc.mulNum());
		// 나눗셈출력
		System.out.println(calc.divNum());
	}
}
