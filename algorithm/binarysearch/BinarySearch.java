
/**
 * BinarySearch
 */
public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int result = -1;
        
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
       BinarySearch binarySearch = new BinarySearch();
       int[] nums = {1,2,5,7,8,9,14,16,18,20,32}; 
       System.out.println(binarySearch.binarySearch(nums, 20));
    }
}