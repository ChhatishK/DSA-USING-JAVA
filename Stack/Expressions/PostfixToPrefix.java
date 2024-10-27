import java.util.*;

public class PostfixToPrefix {

    public static String prefix(String postfix) {
        Stack<String> prefix = new Stack<>();
        for (int i=0; i<postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                prefix.push(ch+"");
            } else {
                String v2 = prefix.pop();
                String v1 = prefix.pop();
                prefix.push(ch + v1 + v2);
            }
        }

        return prefix.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String postfix = scan.next();
        System.out.println(prefix(postfix));
    }
}