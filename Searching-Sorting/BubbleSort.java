import java.util.*;
public class BubbleSort {
    static int bubbleSort(int arr[]) {
        int swapCount = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapCount++;
                }

            }
        }
        return swapCount;
    }

    public static void main(String args[]) {
        int arr[] = {128, 30, 9, 8, 40, 5, 100, 80, 90};
        int swapCount = bubbleSort(arr);
        System.out.println(Arrays.toString(arr)+"\nTotal Swaping : "+swapCount);
    }
}