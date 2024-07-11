package Recursion;

public class Josephus {
    static int safePeople (int k, int n) {
        if (n==1) {
            return 0;
        }

        return (safePeople(k, n-1)+k)%n;
    } 

    public static void main(String args[]) {
        int n=5, k = 2;
        System.out.println("The safe person : "+(safePeople(k, n)+1));
    }
}