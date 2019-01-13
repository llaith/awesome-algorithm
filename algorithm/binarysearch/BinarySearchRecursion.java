

/**
 * BinarySearchRecursion
 */
public class BinarySearchRecursion {

    public int binarySearch(int[] nums, int target) {
        return binarySearchRecursion(nums, 0, nums.length - 1, target);
    }

    private int binarySearchRecursion(int[] nums, int begin, int end, int target) {

        int mid = begin + ((end - begin) >> 1);
        if (begin > end) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            begin = mid + 1;
        } else {
            end = mid - 1;
        }
        return binarySearchRecursion(nums, begin, end, target);
    }

    public static void main(String[] args) {

        BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
        int[] nums = {1,2,5,7,8,9,14,16,18,20,32};
        System.out.println(binarySearchRecursion.binarySearch(nums, 20));
    }
}