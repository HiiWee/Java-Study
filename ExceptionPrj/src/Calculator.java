
public class Calculator {
	public Calculator() {
	}

										// throw를 내가 처리하지 않고
										// 나를사용하는 책임자가 처리하게 던짐
	public static int add(int x, int y) throws ExceptionOver1000, ExceptionBecomeNegative {
										// 복수형인이유 : 예외가 한 개가 아니라 여러개 일 수 도 있으므로
										//				 한번에 던지기 위해서 복수형
		int result = x + y;
		// 우리가 만드는 업무적인 예외
		if (result > 1000) {
			throw new ExceptionOver1000();
		}
		
		if (result < 0) {
			throw new ExceptionBecomeNegative();
		}
		return result;
	}

	public static int sub(int x, int y) throws ExceptionBecomeNegative {
		int result = x + y;
		// 우리가 만드는 업무적인 예외
		if (result < 0) {
			throw new ExceptionBecomeNegative();
		}
		return result;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

}
