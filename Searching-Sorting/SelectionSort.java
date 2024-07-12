import java.util.*;
public class SelectionSort {
    static int selectionSort(int arr[]) {
        boolean indexSwapped[] = new boolean[arr.length];
        int swapCount = 0;
        for (int i=0; i<arr.length; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    swapCount++;
                    System.out.print(min+" ");
                    indexSwapped[min] = true;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(indexSwapped));
        return swapCount;
    }
    public static void main(String args[]) {
        int arr[] = {128, 30, 9, 8, 40, 5, 100, 80, 90};
        int swapCount = selectionSort(arr);
        System.out.println(Arrays.toString(arr)+"\nTotal Swapping : "+swapCount);
    }
}