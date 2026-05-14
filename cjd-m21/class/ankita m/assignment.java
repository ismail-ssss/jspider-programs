
import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = n;
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.err.print(" * "); 
                }else {
                    System.err.print(k);
                }
                k--;
            }
            System.err.println();
        }
    }
}
