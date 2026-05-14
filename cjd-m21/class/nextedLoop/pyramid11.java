
import java.util.Scanner;

class pyramid11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j < n-i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
