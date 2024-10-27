import java.util.*;

public class PostfixToInfix {

    public static String infix(String postfix) {
        Stack<String> infix = new Stack<>();

        for (int i=0; i<postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                infix.push(ch + "");
            } else {
                String v2 = infix.pop();
                String v1 = infix.pop();
                infix.push(v1 + ch + v2);
            }
        }

        return infix.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String postfix = scan.next();
        System.out.println(infix(postfix));
    }
}