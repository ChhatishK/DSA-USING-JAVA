
import java.util.*;
class DecToBin {
    
    public static String decToBin(int dec) {
        if (dec == 0) {
            return "0";
        }

        StringBuilder bin = new StringBuilder();

        while (dec > 0) {
            int rem = dec % 2;
            bin.insert(0, rem);
            dec /= 2;                        
        }

        return bin.toString();
    }

    // Best approach
    public static int DecimaltoBinary(int dec) {
        if (dec == 0) {
            return 0;
        }
        int flag = 1;
        int bin = 0;
        while (dec>0) {
            int rem = dec%2;
            bin = bin + rem*flag;
            dec /= 2;
            flag *= 10;
        }
        return bin;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int dec = scan.nextInt();
        System.out.println(dec + " in binary using Best approach : "+DecimaltoBinary(dec));
        System.out.println(dec + " in binary using StringBuilder : "+decToBin(dec));
        scan.close();
    }
}