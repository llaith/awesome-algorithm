
/**
 * Leetcode134
 */
public class Leetcode134 {

    
    public int canCompleteCircuit(int[] gas, int[] cost) {

        if (gas.length <= 0 || cost.length <= 0) {
            return -1;
        }

        int total = 0;
        int temp = 0;
        int index = 0;

        for (int i = 0; i < gas.length; i++)  {

            total += gas[i] - cost[i];
            temp += gas[i] - cost[i];
            if (temp < 0) {
                index = i + 1;
                temp = 0;
            }
        }

        return total < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        Leetcode134 leetcode134 = new Leetcode134();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(leetcode134.canCompleteCircuit(gas, cost));
    }   
}