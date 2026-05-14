
import java.util.Scanner;

class J_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            n++;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 ||j==n/2+1|| (i == n && j<=n/2+1)) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }

    }
}
