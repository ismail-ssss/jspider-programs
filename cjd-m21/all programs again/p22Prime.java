
import java.util.Scanner;

class p22Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("starting no");
        int start = sc.nextInt();
        System.err.println("ending no");
        int end = sc.nextInt();

        int count = 0;

        for (int i = end; i >= start; i--) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                if (count == 2) {
                    System.err.println(i);
                }
            }
            // else System.err.println("It is not a prime number.");
        }
    }
}
