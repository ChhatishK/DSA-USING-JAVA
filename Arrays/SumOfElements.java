package Arrays;

import java.util.Scanner;

public class SumOfElements {

    public static int sumOfElements(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array  :");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i=0; i<size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Sum of elements : "+sumOfElements(arr));

    }
}