import java.util.*;

public class PrintStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Using Another stack
        // Stack<Integer> rt = new Stack<>();

        // while (!st.isEmpty()) {
        //     rt.push(st.pop());
        // }

        // while (!rt.isEmpty()) {
        //     int x = rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }


        // System.out.println();
        // System.out.println(st);

        // Using an Array
        // int n = st.size();
        // int arr[] = new int[n];

        // for (int i=0; i<n; i++) {
        //     arr[i] = st.pop();
        // }

        // for (int i=n-1; i>=0; i--) {
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }

        // System.out.println(st);

        // Using Recursion
        printInReverse(st);
        System.out.println(st);
    }

    // print stack in reverse order 
    public static void printInReverse(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int x = st.pop();
        printInReverse(st);
        System.out.print(x+" ");
        st.push(x);
    }
}