package ch06;

public class Ex06_02 {

	public static void main(String[] args) {
		int[] numArr = {20, 10, 21, 34, 32, 523, 123, 43241, 123};
		int max;
		
		max = numArr[0];
		for(int i: numArr) {
			if (i > max)
				max = i;
		}
		System.out.println("배열 요소의 최대값은 : " + max);
	}

}
