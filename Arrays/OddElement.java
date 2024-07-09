package Arrays;

public class OddElement {
    private static void findOddElement(int arr[]) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of odd element : "+sum);
    }
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 34, 78};
        findOddElement(arr);
    }
}