import java.util.*;

public class InfixToPrefix {

    public static String prefix(String infix) {
        Stack<String> exp = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i=0; i<infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                int n = 0;
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    n = n * 10 + (infix.charAt(i) - '0');
                    i++;
                }

                exp.push(String.valueOf(n));
                i--;
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = exp.pop();
                    String v1 = exp.pop();
                    char c = op.pop();

                    String t = c + v1 + v2;
                    exp.push(t);
                }

                op.pop();
            } 
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == '+' || ch == '-') {
                String v2 = exp.pop();
                String v1 = exp.pop();
                char c = op.pop();

                String t = c + v1 + v2;
                exp.push(t);
                op.push(ch);
            } else {
                if (op.peek() == '+' || op.peek() == '-') {
                    op.push(ch);
                } else {
                    String v2 = exp.pop();
                    String v1 = exp.pop();
                    char c = op.pop();

                    String t = c + v1 + v2;
                    exp.push(t);
                    op.push(ch);
                }
            }
        }

        while (exp.size() > 1) {
            String v2 = exp.pop();
            String v1 = exp.pop();
            char c = op.pop();

            String t = c + v1 + v2;
            exp.push(t);
        }

        String prefix = exp.pop();
        return prefix;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String infix = scan.next();
        System.out.println(prefix(infix));
    }
}