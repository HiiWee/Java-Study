
public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// static method
		int result = 0;

		// ���� 1000�� �Ѵ� ���� ó��
		try {
			// ���߿��� �߻��� ���� �������
			result = Calculator.add(3, 4);
			System.out.println("add : " + result);
			result = Calculator.sub(3, 4);
		}
		// try �������� ������ ���ܸ� ��ڴ�.
		// �ܼ��� catch���� �־ ������ġ��
		catch (ExceptionOver1000 e) {
			// �޽����� ���� ������ ������ ���� Ŭ������ �޼ҵ带 �������̵���
			// ���ܸ� ����� ���忡�� �����ϰ� ���ܿ� ���� �޽��� ���ް���
			// ������ �̾�� ���� �ٽ� �Է��ϰ����������� ó�� �ϴ°����� ����ó
			System.out.println(e.getMessage());
		} 
		// �������� �޴� ������ ���� exception else�� default ������ ���� �����Ƿ� �ٸ� catch������ ���� �ö󰡸� �ٸ� ������ ��������
		catch (Exception e) {

		}
		// � catch���� �鸣�� �������� finally���� �� �鸣�Ƿ� ������ �޽����� �ߺ��Ǹ� finally���� �ۼ��� ���� ó���� ����ȭ �� �� ����
		finally {
			System.out.println("�Է� ���� ������ �ֽ��ϴ�.");
			
		}
		
		System.out.println("sub : " + result);
		result = Calculator.mul(3, 4);
		System.out.println("mul : " + result);
		result = Calculator.div(3, 4);
		System.out.println("div : " + result);
	}

}
