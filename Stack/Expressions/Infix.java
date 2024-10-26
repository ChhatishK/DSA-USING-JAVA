import java.util.*;

public class Infix {

    public static int infixEval(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if (ascii >= 48 && ascii <= 57) {
                int n = 0;
                while (i < str.length() && ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57)) {
                    n = n * 10 + (str.charAt(i) - '0');
                    i++;
                }
                val.push(n);
                i--;
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char c = op.pop();

                    if (c == '+') val.push(v1 + v2);
                    else if (c == '-') val.push(v1 - v2);
                    else if (c == '*') val.push(v1 * v2);
                    else if (c == '/') val.push(v1 / v2);
                }
                op.pop();
            } 
            else {
                if (ch == '+' || ch == '-') {
                    while (op.size() != 0) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char c = op.pop();
                        if (c == '+') val.push(v1 + v2);
                        else if (c == '-') val.push(v1 - v2);
                        else if (c == '*') val.push(v1 * v2);
                        else if (c == '/') val.push(v1 / v2);
                    }

                    op.push(ch);
                } else {
                    if (op.peek() == '+' || op.peek() == '-') {
                        op.push(ch);
                    } else {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char c = op.pop();

                        if (c == '*') val.push(v1 * v2);
                        else val.push(v1 / v2);

                        op.push(ch);
                    }
                }
            }

            
        }

        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();

            char c = op.pop();

            if (c == '+') val.push(v1 + v2);
            if (c == '-') val.push(v1 - v2);
            if (c == '*') val.push(v1 * v2);
            if (c == '/') val.push(v1 / v2);
        }

        return val.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String exp = scan.next();
        System.out.println(infixEval(exp));
    }
}