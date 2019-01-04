

/**
 * Leetcode88
 */
public class Leetcode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = 0;
        int nums2Index = 0;
        int[] tempNums= new int[m];
        for(int i = 0; i < m ;i++) {
            tempNums[i] = nums1[i];
        }
        
        for (int i = 0; i < nums1.length; i++) {
            if(nums1Index == m) {
                nums1[i] = nums2[nums2Index++];
            } else if(nums2Index == n) {
                nums1[i] = tempNums[nums1Index++];
            } else {
                if (tempNums[nums1Index] <= nums2[nums2Index]) {
                    nums1[i] = tempNums[nums1Index++];
                } else {
                    nums1[i] = nums2[nums2Index++];
                }
            } 
        }   
    }
    public static void main(String[] args) {
        Leetcode88 leetcode88 = new Leetcode88();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        leetcode88.merge(nums1, 3, nums2, 3); 
        for (int i = 0; i < nums1.length;i++) {
            System.out.println(nums1[i]);
        }
    }
}