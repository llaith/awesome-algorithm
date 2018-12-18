

/**
 * Leetcode717
 */
public class Leetcode717 {

    public boolean isOneBitCharacter(int[] bits) {
        
        int i = 0;
        for (; i < bits.length - 1;) {

            if ( bits[i] == 0) {
                i++;
            } else if (bits[i] == 1) {
                i += 2;
            }
        }

        if (i > bits.length - 1) {
            return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        Leetcode717 leetcode717 = new Leetcode717();

        int bits[] = {1,1,1,0};

        System.out.println(leetcode717.isOneBitCharacter(bits));

        
    }
}