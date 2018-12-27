import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode119
 */
public class Leetcode119 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        if (rowIndex == 0) {
            return result;
        }

        for (int i = 0; i < rowIndex - 1; i++) {
            double next = 1.0 * result.get(i) * (rowIndex - i) / (i + 1);
            result.add((int) next);
        }

        result.add(1);

        return result;
    }

    /**
     * 超时
     * @param rowIndex
     * @return
     */
    /*
    public List<Integer> getRow(int rowIndex) {
    
        List<Integer> result = new ArrayList<>();
 
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }

        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }

        result = Arrays.asList(getEveryRow(rowIndex));

        return result;
    }


    public Integer[] getEveryRow(int row) {
        if (row == 0) {
            return new Integer[]{1};
        }
        if (row == 1) {
            return new Integer[]{1,1};
        }

        Integer result[] = new Integer[row+1];

        for (int i = 0; i <= row; i++) {
            if (i == 0|| i == row) {
                result[i] = 1;
            }
            else {
                result[i] = getEveryRow(row - 1)[i-1] + getEveryRow(row - 1)[i];
            }
        }

        return result;
    }
*/
    
    public static void main(String[] args) {
        Leetcode119 leetcode119 = new Leetcode119();

        List<Integer> result = leetcode119.getRow(10);

        for (Integer i : result) {
            System.out.print(i+" ");
        }

    }
}