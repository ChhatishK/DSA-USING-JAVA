package Functions;

class Addition {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    // Write a java method to find the smallest number among three numbers
    private static int smallesAmongstThree(int a, int b , int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    // Write a java program to find length of longest proper prefix which have same suffix in the string.
    private static int longestProperPrefix(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int n = str.length();
        int maxLength = 0;
        String prefix = "";
        for (int len = 1; len <= n/2; len++) {
            if (str.substring(0, len).equals(str.substring(n-len))) {
                prefix = str.substring(0, len);
                maxLength = len;
            }
        }
        System.out.println("Prefix : "+prefix);
        return maxLength;
        
    }

    private static String checkSuffix(String str, String prefix) {
        // System.out.println("Str : "+str+"......."+"Prefix : "+prefix);
        StringBuffer pref = new StringBuffer();
        for (int i=prefix.length()-1; i>=0; i--) {
            if (prefix.charAt(i) == str.charAt(i)) {
                pref.insert(0, str.charAt(i));
            } else {
                return "";
            }
        }

        return pref.toString();
    }

    void hello() {
        System.out.println("Hello World!");
    }

    // Write a program to print k times next character at that current character's position.
    public static String changeString(String str, int k) {
        if (str.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        int a = 'a' - 0;
        int z = 'z' - 0;
        for (int i=0; i<str.length(); i++) {
            int ch = str.charAt(i) - 0;
            ch += k;

            if (ch > z) {
                ch %= z;
                res.append((char)(a+ch));
            } else {
                res.append((char) ch);
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        // System.out.println(add(2,3));
        // Test t = new Test();
        // t.hello();
        // Addition a = new Addition();
        // System.out.println(a.sum(2, 5));
        // System.out.println(a.sum(2.0, 5.0));

        // int a = 25, b = 37, c = 29;
        // System.out.println(smallesAmongstThree(a, b, c));

        // String str = "smartintsmart";
        // System.out.println(longestProperPrefix(str));

        String str = "smart";
        System.out.println(changeString(str, 3));
    }
    
}