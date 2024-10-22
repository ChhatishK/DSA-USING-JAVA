import java.util.*;

public class BalancedBracket {

    public static boolean isBalance(String str) {
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(isBalance(str));
    }
}