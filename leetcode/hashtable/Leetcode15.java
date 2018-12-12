import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Leetcode15
 */
public class Leetcode15 {

    /**
     * 递归的方式是否可以解决？
     */



    /**
     * 这种也能实现，但是也还是超时
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = null;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        for (int i = 0; i < nums.length; i ++) {
            if (map.get(nums[i]) > 1) {
                map.put(nums[i], map.get(nums[i]) - 1);
            } else {
                map.remove(nums[i]);
            }
            for (int j = i+1; j < nums.length; j++) {
                if (map.get(nums[j]) > 1) {
                    map.put(nums[j], map.get(nums[j]) - 1);
                } else {
                    map.remove(nums[j]);
                }

                if(map.containsKey(-(nums[i]+ nums[j]))) {
                    temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-(nums[i] + nums[j]));
                    boolean contain = false;

                    for (List<Integer> l : result) {
                        if(l.containsAll(temp) && temp.containsAll(l)) {
                            contain = true;
                        }
                    }

                      if(!contain) {
                          result.add(temp);
                      }
                }

                if (map.containsKey(nums[j])) {
                    map.put(nums[j], map.get(nums[j]) + 1);
                } else {
                    map.put(nums[j], 1);
                }
                
            }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        return result;
    }


    /**
     * 下面这种方法可以运行，但是超时
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = null;

        for (int i = 0; i < nums.length; i ++) {
            for (int j = i+1; j < nums.length; j++) {
              for (int k = j+1; k < nums.length; k++) {
                  if(nums[k] == -(nums [i]+ nums[j])) {
                      temp = new ArrayList<>();
                      temp.add(nums[i]);
                      temp.add(nums[j]);
                      temp.add(nums[k]);

                      boolean contain = false;
                      
                      for (List<Integer> l : result) {
                          Collections.sort(l);
                          Collections.sort(temp);
                          if (l.get(0) == temp.get(0) && l.get(1) == temp.get(1) && l.get(2) == temp.get(2)) {
                              contain = true;
                          }
                      }
                      
                      if(!contain) {
                          result.add(temp);
                      }
                      
                  }
              }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode15 leetcode15 = new Leetcode15();
        int nums[] = new int[]{0,3,0,1,1,-1,-5,-5,3,-3,-3,0}; 

        for(List<Integer> r : leetcode15.threeSum(nums)) {

            for(Integer i : r) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}