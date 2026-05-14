
import java.util.Scanner;

public class emptyDimond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scanner.nextInt();
        int sp = n / 2, star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.err.print("_");
            }

            for (int j = 1; j <= star; j++) {
                if(j==1||j==star)
                System.err.print("X");
                else System.err.print(" ");
            }

            if (i <= n / 2) {
                sp--;
                star += 2;
            } else {
                sp++;
                star -= 2;
            }
            System.err.println();
        }
    }
}
