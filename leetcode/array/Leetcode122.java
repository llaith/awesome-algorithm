
/**
 * Leetcode122
 */
public class Leetcode122 {

    public int maxProfit(int[] prices) {
    
        int result = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < prices[i+1]) {
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Leetcode122 leetcode122 = new Leetcode122();
        int prices[] = {7,1,5,3,6,4};
        System.out.println(leetcode122.maxProfit(prices));

    }
}