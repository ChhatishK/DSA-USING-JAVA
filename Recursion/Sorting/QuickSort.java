import java.util.*;
public class QuickSort {

    public static void quicksort(int nums[], int si, int ei) {
        if (si >= ei) return;

        int s = si;
        int e = ei;
        int mid = s + (e - s)/2;
        int pivot = nums[mid];
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            } 

            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quicksort(nums, si, e);
        quicksort(nums, s, ei);
    }

    public static void main(String args[]) {
        int nums[] = {1,2,0,0};
        System.out.println(Arrays.toString(nums));
        quicksort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}