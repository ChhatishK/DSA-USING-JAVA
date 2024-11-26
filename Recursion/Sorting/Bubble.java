import java.util.*;

public class Bubble {

    public static void sort(int a[], int ei, int si) {
        if (ei == 0) return;

        if (si < ei) {
            if (a[si] > a[si+1]) {
                int temp = a[si];
                a[si] = a[si+1];
                a[si + 1] = temp;
            }

            sort(a, ei, si+1);
        } else {
            sort(a, ei-1, 0);
        }
    }

    public static void selection(int a[], int ei, int si, int max) {
        if (ei == 0) return;

        if (si < ei) {
            if (a[si] > a[max]) {
                selection(a, ei, si+1, si);
            } else {
                selection(a, ei, si+1, max);
            }
        } else {
            int temp = a[max];
            a[max] = a[ei-1];
            a[ei-1] = temp;

            selection(a, ei-1, 0, 0);
        }
    }

    public static void main(String args[]) {
        int nums[] = {4,3,2,1};
        System.out.println(Arrays.toString(nums));
        selection(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }
}