
/**
 * Leetcode69
 */
public class Leetcode69 {

    public int mySqrt(int x) {
        int begin = 0;
        int end = x;

        while (begin <= end) {
            long mid = begin + (end -  begin) / 2;
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                begin = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }
        }

        return end;
    }
    

    public static void main(String[] args) {
        Leetcode69 leetcode69 = new Leetcode69();
        System.out.println(leetcode69.mySqrt(2147395599));
    }
}