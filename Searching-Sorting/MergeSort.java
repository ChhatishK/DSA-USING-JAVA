import java.util.Arrays;
public class MergeSort {

    public static void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si)/2;

        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);

        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (nums[i] > nums[j]) {
                temp[k++] = nums[j++];
            } else {
                temp[k++] = nums[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for (k=0, i=si; k<temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }
    public static void main(String args[]) {
        int nums[] = {5,4,3,2,1,6,7,8,9,10};
        System.out.println("Before MergeSort : "+Arrays.toString(nums));
        int n = nums.length;
        mergeSort(nums, 0, n-1);

        System.out.println("After MergeSort : "+Arrays.toString(nums));
    }
}