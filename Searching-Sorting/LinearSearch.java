public class LinearSearch {
    static int findElement(int arr[], int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]) {
        int target = 4;
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println("Target present at index : "+findElement(arr, target));
    }
}