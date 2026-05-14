
import java.util.Scanner;

class sumOfPerfectNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("start");
        int start = sc.nextInt();
        System.err.println("end");
        int end = sc.nextInt();

        int addperNo = 0;
        int num = 0, sum = 0;
        for (int i = start; i <= end; i++) {
            num += i;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += i;
                }
            }

            // if (sum == num) {
            //     System.err.println("perfect = " + num);
            // }
        }
            if (sum == num) {
                System.err.println("perfect = " + addperNo);
            }
            else{
                System.err.println("no perfect = " + num);

            }
    }
}
