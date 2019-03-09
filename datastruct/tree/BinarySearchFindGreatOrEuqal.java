/**
 * BinarySearchFindGreatOrEuqal
 */
public class BinarySearchFindGreatOrEuqal {

    public int binarySearch(int[] nums, int target) {
        int result = -1;
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] >= target) {
                if (mid == 0 || nums[mid -1] < target) {
                    result = mid;
                    break;
                }
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinarySearchFindGreatOrEuqal binarySearchFindGreatOrEuqal = new BinarySearchFindGreatOrEuqal();
        int nums[] = {2,3,5,6,7};
        System.out.println(binarySearchFindGreatOrEuqal.binarySearch(nums, 4));        
 
    }
}