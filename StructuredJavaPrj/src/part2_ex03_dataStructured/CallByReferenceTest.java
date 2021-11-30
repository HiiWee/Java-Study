package part2_ex03_dataStructured;

public class CallByReferenceTest {

	public static void main(String[] args) {
		int[] nums = new int[3];
		System.out.printf("%d\n", nums[0]);
		inputList(nums);
		printList(nums);

	}

	private static void printList(int[] nums) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d", nums[i]);
		}
	}

	private static void inputList(int[] nums) {
		int[] nums2 = new int[3];
		for (int i = 0; i < 3; i++) {
			nums2[i] = i;
			nums[i] = nums2[i];
		}

	}

}
