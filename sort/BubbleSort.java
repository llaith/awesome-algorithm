/**
 * Time complexity O(n^2)
 * Space complexity O(n^2)
 */
public class BubbleSort {
	public void bubbleSort(int[] nums) {
		boolean sorted;
		for (int i = 0; i < nums.length; i++) {
			sorted = true;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					sorted = false;
				}
			}
			if (sorted == true) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int nums[] = {2,5,6,4,1,8,9};
		bubbleSort.bubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
