
import java.util.Scanner;

class p18OneDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
            if (n == 0 && sum >= 9) {
                System.err.println(sum);
                n = sum;
                sum = 0;
            }
        }
        System.err.println("left sigle digit is = "+sum);
    }
}
