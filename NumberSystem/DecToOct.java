import java.util.*;
class DecToOct {

    public static int DecimalToOctal(int dec) {
        if (dec == 0) {
            return 0;
        }

        int oct = 0;
        int flag = 1;
        while (dec>0) {
            int rem = dec%8;
            oct = oct+rem*flag;
            dec /= 8;
            flag *= 10;
        }


        return oct;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal Number : ");
        int dec = scan.nextInt();
        System.out.println(dec +" in octal : "+DecimalToOctal(dec));
        scan.close();
    }
}