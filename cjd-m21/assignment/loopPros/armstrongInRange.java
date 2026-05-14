
import java.util.Scanner;

class armstrongInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int start = sc.nextInt();
        System.err.println("Enter a number");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int count = 0;
            for (int j = 1; n != 0; j++) {
                count++;
                n /= 10;
            }

            n = i;
            int sum = 0, temp;
            for (int j = 1; j <= count; j++) {
                int rem = n % 10;
                temp = rem;
                for (int k = 1; k < count; k++) {
                    rem *= temp;
                }
                sum += rem;
                n /= 10;
            }
            if (i == sum) {
                System.err.println(sum);
            }
        }
    }
}
