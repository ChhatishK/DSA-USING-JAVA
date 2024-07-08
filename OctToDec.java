import java.util.Scanner;

public class OctToDec {
    public static int OctalToDecimal (int oct ) {
        if (oct == 0) {
            return 0;
        }
        int dec = 0;
        int i=0;
        while (oct > 0) {
            int rem = oct % 10;
            dec += rem*Math.pow(8, i++);
            oct /= 10;
        }

        return dec;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a octal number : ");
        int oct = scan.nextInt();
        System.out.println(oct +" in decimal : "+OctalToDecimal(oct));
        scan.close();
    }
    
}