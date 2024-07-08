package BitManipulation;

import java.util.Scanner;

public class Test {
    public static void getBit(int num, int pos) {
        int bitMask = 1<<pos;
        int ans = bitMask&num;
        System.out.println("GetBit Result : "+ans);
        // if ((bitMask&num) == 0) {
        //     System.out.println("Zero");
        // } else {
        //     System.out.println("One");
        // }
    }

    public static void setBit(int num, int pos) {
        int bitMask = 1<<pos;

        // int n = bitMask/num;
        int n = bitMask | num;
        System.out.println("SetBit Result : "+n);
    }

    public static void clearBit(int num, int pos) {
        int bitMask = 1<<pos;

        int ans = ~bitMask&num;

        System.out.println("ClearBit Result : "+ans);
    }

    public static void updateBit(int num, int pos) {
        int bitMask = 1<<pos;

        
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.print("Enter position : ");
        int pos = scan.nextInt();

        getBit(num, pos);
        setBit(num, pos);
        clearBit(num, pos);
        
        scan.close();
    }
    
}