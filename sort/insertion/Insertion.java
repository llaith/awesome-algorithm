import java.util.*;

public class Insertion {

    public static void sort(Comparable[] a) {
        int num = a.length;

        for(int i = 1; i < num; i++) {

            for(int j = i; j > 0&& Util.less(a[j], a[j - 1]); j--) {
                Util.exch(a, j, j -1);
            }
        }
    }

    public static void main(String[] args) {

        Integer[] a = new Integer[]{1,5,3,9,8,4,10,6};
        sort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
