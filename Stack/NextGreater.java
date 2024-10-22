import java.util.*;

public class NextGreater {

    // Brute Force Approach
    public static void nextGreater(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            boolean flag = true;
            for (int j=i+1; j<n; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    flag = false;
                    break;
                }
            }

            if(flag) arr[i] = -1;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println(Arrays.toString(arr));
        nextGreater(arr);
        System.out.println(Arrays.toString(arr));
    }
}