import java.util.*;

public class ReomveFromStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);
        // Remove second element
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 2) {
            temp.push(st.pop());
        }

        st.pop();
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}