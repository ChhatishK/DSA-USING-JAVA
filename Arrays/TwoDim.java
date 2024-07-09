package Arrays;
import java.util.*;
public class TwoDim {
    // Sort the array in ascending order.
    private static void ascendingOrder(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            boolean swapped = false;
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter row : ");
        // int row = scan.nextInt();
        // System.out.println("Enter column : ");
        // int col = scan.nextInt();

        // int arr[][] = new int[row][col];

        // for (int i=0; i<row; i++) {
        //     for (int j=0; j<col; j++) {
        //         arr[i][j] = scan.nextInt();
        //     }
        // }

        // System.out.println("Elements of the array :- ");
        // for (int i=0; i<row; i++) {
        //     for (int j=0; j<col; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int temp[] = {4,2,56,7,2};
        ascendingOrder(temp);

        System.out.println("Sorted Array :- ");
        for (int i=0; i<temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    
}