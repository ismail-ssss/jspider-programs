
import java.util.Scanner;

class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int backup = n;
        int count = 0;
        for (int i = 1; n != 0; i++) {
            count++;
            n /= 10;
        }
        n = backup;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {
                prod *= rem;
            }
            System.err.println(prod);
            sum += prod;
            n /= 10;
        }
        System.err.println(sum);
        if (sum == backup) {
            System.err.println("Armstrong No");
        } else {
            System.err.println("not armstrong No");
        }
    }
}
