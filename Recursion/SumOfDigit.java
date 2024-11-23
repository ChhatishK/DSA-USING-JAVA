package Recursion;

public class SumOfDigit {
    static int digitSum(int n) {
        if (n == 0) return n;
        
        return n%10 + digitSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }
}