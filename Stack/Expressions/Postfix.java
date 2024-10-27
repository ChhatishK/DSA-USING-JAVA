import java.util.*;

public class Postfix {

    public static int postfix(String exp) {
        Stack<Integer> val = new Stack<>();

        for (int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);

            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - '0');
            } else {
                int v2 = val.pop();
                int v1 = val.pop();
                if (ch == '+') val.push(v1 + v2);
                if (ch == '-') val.push(v1 - v2);
                if (ch == '*') val.push(v1 * v2);
                if (ch == '/') val.push(v1 / v2);
            }
        }

        return val.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String exp = scan.next();
        System.out.println(postfix(exp));
    }
}