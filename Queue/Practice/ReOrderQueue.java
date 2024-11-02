import java.util.*;

public class ReOrderQueue {

    public static void reOrder(Queue<Integer> q, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<n/2; i++) {
            st.push(q.poll());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }

        for (int i=0; i<n/2; i++) {
            st.push(q.poll());
        }

        while (st.size() > 0) {
            q.add(st.pop());
            q.add(q.poll());
        }

        while (q.size() > 0) {
            st.push(q.poll());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        reOrder(q, q.size());
        System.out.println(q);
    }
}