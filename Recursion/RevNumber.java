public class RevNumber {
    static int sum = 0;
    public static void main(String args[]) {
        // reverse1(123);
        // System.out.println(sum);

        System.out.println(reverse2(123));
    }
    static void reverse1(int n) {
        if (n == 0) return;
        sum = sum * 10 + n%10;
        reverse1(n/10);

    }

    static int reverse2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n%10 == n) return n;

        return n%10 * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}