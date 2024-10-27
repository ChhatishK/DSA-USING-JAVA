import java.util.*;

public class InfixToPostfix {

    public static String postfix(String infix) {
        Stack<String> exp = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i=0; i<infix.length(); i++) {
            char ch = infix.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String s = "" + (ascii - '0');
                exp.push(s);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = exp.pop();
                    String v1 = exp.pop();
                    char c = op.pop();
                    String s = v1 + v2 + c;
                    exp.push(s);
                }
                op.pop();
            } 
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == '+' || ch == '-') {
                String v2 = exp.pop();
                String v1 = exp.pop();
                char c = op.pop();
                String s = v1+v2+c;
                exp.push(s);
                op.push(ch);
            } else {
                if (op.peek() == '+' || op.peek() == '-') {
                    op.push(ch);
                } else {
                    String v2 = exp.pop();
                    String v1 = exp.pop();
                    char c = op.pop();
                    String s = v1 + v2 + c;
                    exp.push(s);
                    op.push(ch);
                }
            }
        }

        while (exp.size() > 1) {
            String v2 = exp.pop();
            String v1 = exp.pop();
            char c = op.pop();
            String s = v1 + v2 + c;
            exp.push(s);
        }

        return exp.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String infix = scan.next();
        System.out.println(postfix(infix));
    }
}