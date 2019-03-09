import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode350 {

	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>(nums1.length > nums2.length ? nums2.length: nums1.length);
		
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
        	if (map.containsKey(nums2[i])) {
        		map.put(nums2[i], map.get(nums2[i]) + 1);
        	} else {
        		map.put(nums2[i], 1);
        	}
		}
        
        for (int i = 0; i < nums1.length; i++) {
			if (map.size() == 0) {
				break;
			}
			if (map.containsKey(nums1[i])) {
				result.add(nums1[i]);
				if (map.get(nums1[i]) > 1) {
					map.put(nums1[i], map.get(nums1[i]) - 1);
				} else {
					map.remove(nums1[i]);
				}
			}
		}
        
        
        int[] re = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
        	re[i] = result.get(i);
        }
        
        return re;
    }
	
	public static void main(String[] args) {
		
		LeetCode350 leetCode350 = new LeetCode350();
		
		int[] result = leetCode350.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
