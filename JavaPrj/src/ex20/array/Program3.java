package ex20.array;

public class Program3 {
	public static void main(String[] args){
		int[] nums = {2, 3, 6, 4, 1, 5};
		int temp;
		
		for(int i=0; i<6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println("");
		temp = nums[1];
		nums[1] = nums[3];
		nums[3] = temp;

		for(int i=0; i<6; i++)
			System.out.printf("%d ", nums[i]);
		
	}
}
