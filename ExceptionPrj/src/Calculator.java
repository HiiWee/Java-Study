
public class Calculator {
	public Calculator() {
	}

										// throw�� ���� ó������ �ʰ�
										// ��������ϴ� å���ڰ� ó���ϰ� ����
	public static int add(int x, int y) throws ExceptionOver1000, ExceptionBecomeNegative {
										// ������������ : ���ܰ� �� ���� �ƴ϶� ������ �� �� �� �����Ƿ�
										//				 �ѹ��� ������ ���ؼ� ������
		int result = x + y;
		// �츮�� ����� �������� ����
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
		// �츮�� ����� �������� ����
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
