package ch06;

public class Ex06_05 {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		
		for (int i = 0; i < arr.length/2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		
	}

}
