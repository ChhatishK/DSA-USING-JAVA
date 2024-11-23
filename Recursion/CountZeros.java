public class CountZeros {

    static int countZeroes(int n, int count) {
        if (n == 0) return count;

        if (n % 10 == 0) {
            countZeroes(n/10, count++);
        } else {
            countZeroes(n/10, count);
        }
    }

    public static void main(String args[]) {
        System.out.println(countZeroes(3020001, 0));
    }
}