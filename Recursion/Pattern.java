public class Pattern {

    public static void reverseTriangle(int n, int c) {
        if (n == 0) return;

        if (c < n) {
            System.out.print("* ");
            reverseTriangle(n, c+1);
        } else {
            System.out.println();
            reverseTriangle(n-1, 0);
        }
        
    }

    public static void triangle(int n) {
        helper(n, 0);
    }

    public static void helper(int n, int c) {
        if (n == 0) return;

        if (c < n) {
            helper(n, c+1);
            System.out.print("* ");
        } else {
            helper(n-1, 0);
            System.out.println();
        }
        
    }

    public static void main(String args[]) {
        int n = 5;
        // triangle(n);
        reverseTriangle(n, 0);
    }
}