import java.util.*;

public class Stream {
    public static void main(String args[]) {
        String s = "abcdag";
        skip("", s);
        System.out.println(skip(s));
    }

    static void skip(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String s) {
        if (s.length() == 0) return "";
        if (s.charAt(0) == 'a') {
            return skip(s.substring(1));
        } else {
            return s.charAt(0) + skip(s.substring(1));
        }
    }
}