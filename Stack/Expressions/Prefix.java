import java.util.Stack;
import java.util.Scanner;

public class Prefix {

    public static int prefix(String exp) {
        Stack<Integer> val = new Stack<>();

        for (int i=exp.length()-1; i>=0; i--) {
            char ch = exp.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ch - '0');
            } else {
                int v1 = val.pop();
                int v2 = val.pop();

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
        System.out.println(prefix(exp));
    }
}