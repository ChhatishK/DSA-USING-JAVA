package Vjudge;

import java.util.Scanner;

/**
 * First
 */
public class First {

    static int remainingApple (int n, int k) {
        return k%n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(remainingApple(n, k));
    }
}