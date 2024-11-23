package Recursion;

public class Fibonacci {
    static int fib(int n) {
        if (n==0 || n==1) {
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        // fib(n);
        for (int i=0; i<n; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
    }
}