
import java.util.Scanner;

class perfectNoOfRange {


// perfect numbers are = 6,28,496,8128
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Starting No");
        int start = sc.nextInt();
        System.err.println("Enter Ending No");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i, sum = 0;

            for (int j = 1; j <= n / 2; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            if (sum == n) {
                System.err.println(sum);
            }
        }
    }
}
