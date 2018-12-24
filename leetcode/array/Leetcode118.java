import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode118
 */
public class Leetcode118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (numRows == 0) {
            return result;
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);

        Integer t1[] = new Integer[]{1};
        Integer t2[] = null;
        for (int i = 2; i <= numRows; i++) {
            t2 = new Integer[t1.length+1];
            for (int j = 0; j <= t1.length; j++) {
                int num1 = 0;
                int num2 = 0;
                if (j - 1 >= 0) {
                    num1 = t1[j-1];
                }
                if (j <= t1.length - 1) {
                    num2 = t1[j];
                }
                t2[j] = num1 + num2;
            }
            result.add(Arrays.asList(t2));
            t1 = t2;
        }


        return result;
    }
    

    public static void main(String[] args) {
        Leetcode118 leetcode118 = new Leetcode118();
        List<List<Integer>> result = leetcode118.generate(5);
        printList(result);

    }


    static  void printList(List<List<Integer>> l) {
        for (List<Integer> v : l) {
            for (Integer i  : v) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}