﻿
public class ExceptionOver1000 extends Exception {
	
	@Override
	public String getMessage() {
		return "입력 값의 합이 1000을 넘는 오류가 발생했습니다.";
	}
}
