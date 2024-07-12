public class BinarySearch {

    static int findElement(int arr[], int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String Radhe[]) {
        int target = 2;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Target present at index : "+findElement(arr, target));
    }
    
}