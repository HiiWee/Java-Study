
public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// static method
		int result = 0;

		// 합이 1000을 넘는 예외 처리
		try {
			// 다중예외 발생시 같이 묶어놓음
			result = Calculator.add(3, 4);
			System.out.println("add : " + result);
			result = Calculator.sub(3, 4);
		}
		// try 구문에서 던져진 예외를 잡겠다.
		// 단순히 catch블럭만 있어도 오류조치됨
		catch (ExceptionOver1000 e) {
			// 메시지를 직접 쓸수도 있지만 예외 클래스의 메소드를 오버라이드해
			// 예외를 만드는 입장에서 동일하게 예외에 대한 메시지 전달가능
			// 앞으로 이어갈지 말지 다시 입력하게할지말지를 처리 하는과정이 예외처
			System.out.println(e.getMessage());
		} 
		// 나머지를 받는 범위가 넓은 exception else나 default 범위가 가장 넓으므로 다른 catch절보다 위로 올라가면 다른 절들은 무용지물
		catch (Exception e) {

		}
		// 어떤 catch절을 들르든 마지막에 finally절을 꼭 들르므로 동일한 메시지가 중복되면 finally절에 작성해 예외 처리를 집중화 할 수 있음
		finally {
			System.out.println("입력 값에 오류가 있습니다.");
			
		}
		
		System.out.println("sub : " + result);
		result = Calculator.mul(3, 4);
		System.out.println("mul : " + result);
		result = Calculator.div(3, 4);
		System.out.println("div : " + result);
	}

}
