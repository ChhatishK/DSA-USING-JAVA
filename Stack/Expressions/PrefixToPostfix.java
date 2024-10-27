import java.util.*;

public class PrefixToPostfix {

    public static String postfix(String prefix) {
        Stack<String> exp = new Stack<>();

        for (int i=prefix.length()-1; i>=0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                exp.push("" + ch);
            } else {
                String v1 = exp.pop();
                String v2 = exp.pop();
                String s = v1+v2+ch;
                exp.push(s);
            }
        }

        return exp.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String prefix = scan.next();
        System.out.println(postfix(prefix));
    }
}