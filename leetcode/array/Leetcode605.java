
/**
 * Leetcode605
 */
public class Leetcode605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if (flowerbed.length < 1) {
            return false;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if( n == 0) {
                break;
            }
            if (i == 0) {
                if ((flowerbed[0] == 0 && flowerbed.length > 1&& flowerbed[1] == 0) || (flowerbed[0] == 0 && flowerbed.length <= 1)) {
                    n--;
                    flowerbed[0] = 1;
                }
            }
            else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[ i-1] == 0) {
                    n--;
                    flowerbed[i] =1;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                     n--;
                     flowerbed[i] = 1;
                }
            }
        }
        if ( n == 0) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Leetcode605 leetcode605 = new Leetcode605();
        //int[] flowerbed = {1,0,0,0,0,1};
        int[] flowerbed = {0,0,1,0,1};
        System.out.println(leetcode605.canPlaceFlowers(flowerbed, 1));
    }
}