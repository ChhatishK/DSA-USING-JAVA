package Recursion;

public class ChefCompete {

    static boolean isPossible(int n) {
        int even = 0, odd = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                if (i%2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        if (even == odd) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int n = 10;
        if (isPossible(n))
            System.out.println("1");
        else 
            System.out.println("0");
    }}