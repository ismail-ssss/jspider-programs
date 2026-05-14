
import java.util.Scanner;

class p23Strong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number to check a strong number");
        int n = sc.nextInt();
        int sum = 0, backUp = n;
        while (n != 0) {
            int rem = n % 10;
            int prod = 1;
            for (int i = 1; i <= rem; i++) {
                prod *= i;
            }
            sum += prod;
            n /= 10;
            // Math.trunc(n/10);
        }
        if (sum == backUp) {
            System.err.println("it is a strong number"); 
        }else {
            System.err.println("it is not a strong number");
        }
    }
}
