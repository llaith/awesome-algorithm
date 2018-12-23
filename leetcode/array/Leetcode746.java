
/**
 * Leetcode746
 */
public class Leetcode746 {

    public int minCostClimbingStairs(int[] cost) {
        int add[] = new int[cost.length];

        climb(cost, cost.length - 1, add);
        
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    private int climb(int[] cost, int n, int[] add) {
        if (n == 0) {
            return cost[0];
        }
        if (n == 1) {
            return  cost[1];
        }
        if (add[n] != 1) { 
            cost[n] += Math.min(climb(cost, n -1, add),climb(cost, n - 2, add));
            add[n] = 1;
        }
        return cost[n];
    }

    public static void main(String[] args) {
        Leetcode746 leetcode746 = new Leetcode746();
        //int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int cost[] =  {10, 15, 20};
        //int cost[] = {0,1,1,0};
        System.out.println(leetcode746.minCostClimbingStairs(cost));
    }


}
