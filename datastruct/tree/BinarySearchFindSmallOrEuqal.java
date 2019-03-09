
/**
 * BinarySearchFindSmallOrEuqal
 */
public class BinarySearchFindSmallOrEuqal {

    public int binarySearch(int[] nums, int target) {
        int result = -1;
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] <= target) {
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    result = mid;
                    break;
                }
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinarySearchFindSmallOrEuqal binarySearchFindSmallOrEuqal = new BinarySearchFindSmallOrEuqal();
        int nums[] = {2,3,5,6,7};
        System.out.println(binarySearchFindSmallOrEuqal.binarySearch(nums, 4)); 
    }
}