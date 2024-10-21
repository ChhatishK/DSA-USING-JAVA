import java.util.*;

public class CopyInOrder {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println("Enter the value: ");
        int val = scan.nextInt();
        System.out.println("Enter the index: ");
        int idx = scan.nextInt();

        System.out.println(st);

        // reverse Order
        // Stack<Integer> rt = new Stack<>();

        // while (!st.isEmpty()) {
        //     rt.push(st.pop());
        // }

        // System.out.println(rt);

        // In same Order

        // while (!rt.isEmpty()) {
        //     st.push(rt.pop());
        // }

        // System.out.println(st);

        // Insesrt value at index
        insertAtIndex(st, val, idx);
        System.out.println(st);

    }

    // Insert value at index;
    public static void insertAtIndex(Stack<Integer> st, int val, int idx) {
        Stack<Integer> temp = new Stack<>();

        while (st.size() > idx) {
            temp.push(st.pop());
        }

        st.push(val);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
}