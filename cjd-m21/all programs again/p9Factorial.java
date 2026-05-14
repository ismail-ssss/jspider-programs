
import java.util.Scanner;

class p9Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Starting NO : ");
        int start = sc.nextInt();
        System.err.print("Enter ending NO : ");
        int end = sc.nextInt();
        int sum = 0;
        for (int j = start; j <= end; j++) {
            int fact = 1;
            for (int i = 1; i <= j; i++) {
                fact *= i;
            }
            System.err.println(j + " factorial is " + fact + " ");
            sum += fact;
        }
        System.err.println("sum of all factorial NO = "+sum);
    }
}
