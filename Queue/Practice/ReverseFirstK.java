import java.util.*;

public class ReverseFirstK {

    public static void reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int i = k;
        while (k-- > 0) {
            st.push(q.poll());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        int size = q.size();
        for (int j=0; j<size-i; j++) {
            q.add(q.poll());
        }

        // while (st.size() > 0) {
        //     q.add(st.pop());
        // }
    }


    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverseFirstK(q, 5);
        System.out.println(q);
    }
}