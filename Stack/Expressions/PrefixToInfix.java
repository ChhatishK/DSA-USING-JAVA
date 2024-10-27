import java.util.*;

public class PrefixToInfix {

    public static String infix(String prefix) {
        Stack<String> infix = new Stack<>();

        for (int i=prefix.length()-1; i>=0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                infix.push(ch + "");
            } else {
                String v1 = infix.pop();
                String v2 = infix.pop();
                infix.push(v1 + ch + v2);
            }
        }

        return infix.pop();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String prefix = scan.next();
        System.out.println(infix(prefix));
    }
}