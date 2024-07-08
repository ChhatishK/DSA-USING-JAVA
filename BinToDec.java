
import java.util.*;
class BinToDec {

    public static int binaryToDecimal(int bin) {
        if (bin == 0) {
            return 0;
        }
        int dec = 0;
        int i=0;
        while (bin > 0) {
            int rem = bin%10;
            dec += Math.pow(2, i++)*rem;
            bin /= 10;
        }

        return dec;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int bin = scan.nextInt();
        System.out.println(bin+" in decimal : "+binaryToDecimal(bin));
        scan.close();
    }
}