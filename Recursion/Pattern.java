public class Pattern {

    public static void reverseTriangle(int n) {
        if (n == 0) return;
        for (int i=0; i<n; i++) System.out.print("* ");
        System.out.println();

        reverseTriangle(n-1);
    }

    public static void triangle(int n) {
        helper(n, 0);
    }

    public static void helper(int n, int c) {
        if (c == n) return;

        for (int i=0; i<=c; i++) System.out.print("* ");
        System.out.println();

        helper(n, c+1);
    }

    public static void main(String args[]) {
        int n = 5;
        triangle(n);
    }
}