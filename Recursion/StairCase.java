package Recursion;

public class StairCase {

    static int countPossibleWay(int n) {
        if (n <= 0 ) {
            return 1;
        }
        else if (n>=1 && n<= 2) {
            return n;
        }

        return countPossibleWay(n-1) + countPossibleWay(n-2) + countPossibleWay(n-3);
    }

    public static void main(String[] args) {
        System.out.println(countPossibleWay(3));
    }
    
}