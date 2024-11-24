import java.util.ArrayList;

public class Linear {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7};
        // System.out.println(linear(a, 3));

        int b[] = {1,2,3,4,5,3,2,4,5,3,2,3,2,3};
        // System.out.println(findAllIndex(b, 3, 0, new ArrayList<>()));

        System.out.println(findAllIndex(b, 3, 0));
    }

    static int linear(int []a, int target) {
        return helper(a, target, 0);
    }

    static int helper(int []a, int target, int idx) {
        if (idx == a.length) return -1;

        if (a[idx] == target) return idx;

        return helper(a, target, idx+1);
    }

    // Return arraylist of all index of occurances of target
    // static ArrayList<Integer> findAllIndex(int a[], int target, int idx, ArrayList<Integer> list) {
    //     if (idx == a.length) {
    //         return list;
    //     }

    //     if (a[idx] == target) list.add(idx);

    //     return findAllIndex(a, target, idx+1, list);
    // }



    static ArrayList<Integer> findAllIndex(int a[], int target, int idx) {

        ArrayList<Integer> list = new ArrayList<>();

        if (idx == a.length) {
            return list;
        }

        if (a[idx] == target) list.add(idx);

        ArrayList<Integer> retList = findAllIndex(a, target, idx+1);

        list.addAll(retList);

        return list;
    }
}