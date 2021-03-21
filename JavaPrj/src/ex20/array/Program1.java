package ex20.array;

public class Program1 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		for(int i=0; i<7; i++)
			System.out.printf("%d", nums[i]);
		
		int[] temp = new int[10];
		
		for(int i=0; i<7; i++)
			temp[i] = nums[i];
		
		//배열의 이전 C언어의 포인터 느낌 배열의 이름은 주소값을 가지고 있으므
		nums=temp;
		
		nums[7] = 8;
		
		for(int i=0; i<8; i++)
			System.out.printf("%d", nums[i]);
	}
}
