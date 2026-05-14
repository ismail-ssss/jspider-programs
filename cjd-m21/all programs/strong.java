
import java.util.Scanner;

class strong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();
        int backUp = n;

        int count = 0;
        for (int i = 0; n != 0; i++) {
            count++;
            n /= 10;
        }
        System.err.println("count=" + count);
        n = backUp;
        int sum, totalSum = 0;
        String s = "";
        for (int i = 1; i <= count; i++) {
            int rem = n % 10;
            int fact = 1;
            for (int j = 1; j < rem; j++) {
                fact *= j;
                s += rem+"x";
            }
            fact *= rem;
                s += rem;
            sum = fact;
            totalSum += sum;
            n /= 10;
            System.err.println(rem+"! "+s+" = "+sum);
                s = "";
        }
        System.err.println("sum = " + totalSum);
    }
}
