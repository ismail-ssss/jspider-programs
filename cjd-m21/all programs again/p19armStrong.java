
import java.util.Scanner;

class p19armStrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1, sum = 0, backup = n;

        for (int i = 1; i <= n; i++) {
            count++;
            n /= 10;
        }
        n = backup;
        while (n != 0) {
            int rem = n % 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {
                prod *= rem;
            }
            sum += prod;
            n /= 10;
        }
        if (sum == backup) {
            System.err.println("it is an armstrong number"); 
        }else {
            System.err.println("it is not an armstrong number");
        }
    }
}
