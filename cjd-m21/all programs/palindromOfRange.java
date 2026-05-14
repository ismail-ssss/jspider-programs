import java.util.Scanner;

class palindromOfRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter starting NO");
        int start = sc.nextInt();
        System.err.println("Enter Ending NO");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int n = i;
            int rev = 0;
            while (n != 0) {
                int rem = n % 10;
                rev = (rev * 10) + rem;
                n /= 10;
            }
            if (rev == i) {
                System.err.println(rev);
            }
        }
    }
}
