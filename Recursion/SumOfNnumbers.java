public class SumOfNnumbers {
    public static void main(String args[]) {
        System.out.println(sum_of_n_natural_numbers(10));
    }

    static int sum_of_n_natural_numbers(int n) {
        if (n == 0) return 0;

        return n+sum_of_n_natural_numbers(n-1);
    }
}