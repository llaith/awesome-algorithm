
/**
 * BinarySearchFindLast
 */
public class BinarySearchFindLast {
    
    public int binarySearch(int[] nums, int target) {
        int result = -1;
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                begin = mid + 1;
            } else {
                if ((mid == nums.length - 1) || (nums[mid + 1] != target)) {
                    result = mid;
                    break;
                } else {
                    begin = mid + 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
       BinarySearchFindLast binarySearch = new BinarySearchFindLast();
       int[] nums = {1,2,5,7,8,9,14,14,14,20,32}; 
       System.out.println(binarySearch.binarySearch(nums, 14));
    }
    
}