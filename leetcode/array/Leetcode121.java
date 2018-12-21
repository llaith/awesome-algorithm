
/**
 * Leetcode121
 */
public class Leetcode121 {


    public int maxProfit(int[] prices) {
        int result = 0;

        int min = 0;

        for (int i = 0; i < prices.length ; i++) {
            if (prices[min] > prices[i]) {
                min = i;
            }
            if (prices[i] - prices[min] > result) {
                result = prices[i] - prices[min];
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Leetcode121 leetcode121 = new Leetcode121();
        // int prices[] = {7,1,5,3,6,4};
        int prices[] = {1,2};
        System.out.println(leetcode121.maxProfit(prices));
    }
}