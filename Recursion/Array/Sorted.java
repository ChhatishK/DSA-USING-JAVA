public class Sorted {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,17,8,9};
        System.out.println(sorted(a, 0));
    }

    static boolean sorted(int a[], int idx) {
        if (idx == a.length-1) return true;

        return a[idx] < a[idx+1] && sorted(a, idx+1);
    }
}