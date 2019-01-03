

/**
 * Leetcode53
 */
public class Leetcode53 {

    public int maxSubArray(int[] nums){

        return divide(nums, 0, nums.length -1);
    }


    public int divide(int[] nums, int start, int end) {
        if (start >= end) {
            return nums[start];
        }
        int mid = (start + end)/2;

        int leftMax = divide(nums, start, mid-1);
        int rightMax = divide(nums, mid+1, end);

        int midl = nums[mid];
        int sum = midl;
        for (int i = mid -1; i >=start; i--) {
            sum += nums[i];
            midl = Math.max(sum, midl);
        }
        int midr = midl;
        sum = midl;
        for (int j = mid +1; j <= end; j++) {
            sum += nums[j];
            midr = Math.max(sum, midr);
        }
        return Math.max(leftMax, Math.max(rightMax, midr));
    }
    

    public static void main(String[] args) {
        Leetcode53 leetcode53 = new Leetcode53();
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(leetcode53.maxSubArray(nums));
    }
}