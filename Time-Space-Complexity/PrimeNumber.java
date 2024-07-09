import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n == 0|| n==1) {
            return false;
        }

        int size = (int)(Math.sqrt(n));

        int flag = 1;
        for (int i=2; i<=size; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        System.out.println(isPrime(n));;
        scan.close();
    }
}
