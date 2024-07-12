import java.util.*;

public class InsertionSort {

    static void insertionSort(int arr[]) {
        int count = 1;
        for (int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
                count++;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Total Swapping : "+count);
    }
    public static void main(String args[]) {
        int arr[] = {128, 30, 9, 8, 40, 5, 100, 80, 90};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}