
import java.util.Scanner;

class loop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < 10; j++) {
                System.err.println("*");
            }
                System.err.print("*");
        }
    }
}
