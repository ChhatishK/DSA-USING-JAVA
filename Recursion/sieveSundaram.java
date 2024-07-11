package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class sieveSundaram {

    static int SieveOfSundaram(int n) {
        int nNew = (n-1)/2;
        boolean marked[] = new boolean[nNew+1];

        Arrays.fill(marked, false);

        for (int i=1; i<=nNew; i++) {
            for (int j=i; (i+j+2*i*j) <= nNew; j++) {
                marked[i+j+2*i*i] = true;
            }
        }

        if (n>2) {
            System.out.print(2+" ");
        }

        for (int i=1; i<=nNew; i++) {
            if (marked[i] == false) {
                System.out.print(2*i+1+" ");
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        SieveOfSundaram(n);
        System.out.println();
    }
}