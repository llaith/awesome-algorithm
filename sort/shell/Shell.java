import java.util.*;


public class Shell {

    public static void sort(Comparable[] a) {
        int num = a.length;
        int h = 1;

        while(h < num/3)
            h = 3 * h + 1;

        while(h >= 1) {
            for(int i = h; i < num; i++) {

                for(int j = i; j >= h && Util.less(a[j], a[j - h]); j -= h)
                    Util.exch(a, j, j -h);
            }

            h = h /3;
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
