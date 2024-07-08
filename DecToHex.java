import java.util.*;

public class DecToHex {

    public static String decTohex(int dec) {
        if (dec == 0) {
            return "0";
        }
        String chars = "ABCDEF";
        StringBuilder hex = new StringBuilder();
        while (dec > 0) {
            int rem = dec%16;
            if (rem < 10) {
                hex.insert(0, rem);
            } else {
                hex.insert(0, chars.charAt(rem-10));
            }
            dec /= 16;
        }

        return hex.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int dec = scan.nextInt();
        System.out.println(dec +" in hexadecimal : "+decTohex(dec));
        scan.close();
    }
}