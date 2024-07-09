import java.util.Scanner;

class SumOfDigit {
    public static void sumOfDigit (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }

        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number : ");
        int n = scan.nextInt();
        sumOfDigit(n);
    }
}