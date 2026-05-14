
import java.util.Scanner;

class pallidromInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("start");
        int start = sc.nextInt();
        System.err.println("end");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i, rev = 0;

            for (int j = 1; j <= num; j++) {

                while (num != 0) {
                    int rem = num % 10;
                    rev = (rev * 10) + rem;
                    num /= 10;
                }
                if (num == rev) {
                    System.err.println(num);
                }

            }
        }
    }
}
