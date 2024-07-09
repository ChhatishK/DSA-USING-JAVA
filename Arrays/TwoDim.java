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

    // Write a program to display all diagonal elements from the given array.
    static void diagonalElements(int[][] arr){
        System.out.println("Primary Diagonal Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        
        System.out.println("Secondary Diagonal Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
        System.out.println();
    }
    static void allDiagonalElements(int[][] arr, int rows, int cols){
        for (int diag = 0; diag < rows + cols - 1; diag++) {
            // Determine starting point of the diagonal
            int startRow = Math.min(diag, rows - 1);
            int startCol = Math.max(0, diag - rows + 1);

            // Collect elements in this diagonal
            StringBuilder diagonalElements = new StringBuilder();
            for (int i = startRow, j = startCol; i >= 0 && j < cols; i--, j++) {
                diagonalElements.append(arr[i][j]).append(" ");
            }

            // Print the diagonal elements as a group
            System.out.println("(" + diagonalElements.toString().trim() + ")");
        }
    }

    // Add two matrix

    static void add(int[][]arr1, int[][]arr2){
        int r1 = arr1.length;
        int c1 = arr1[r1-1].length;
        int r2 = arr2.length;
        int c2 = arr2[r2-1].length;
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input!, Addition is not possible");
            return;
        }
        int[][] sum = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of the Matrix is: "+Arrays.deepToString(sum));
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

        // int temp[] = {4,2,56,7,2};
        // ascendingOrder(temp);

        // System.out.println("Sorted Array :- ");
        // for (int i=0; i<temp.length; i++) {
        //     System.out.print(temp[i]+" ");
        // }
        // System.out.println();

        int arr[][] = {{1,2,3,4,5}, {6,7,8,9,10}};
        // diagonalElements(arr);
        // allDiagonalElements(arr, arr.length, arr[0].length);
        add(arr, arr);
    }
    
}