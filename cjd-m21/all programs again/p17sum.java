
import java.util.Scanner;

class p17sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Starting NO");
        int start = sc.nextInt();
        System.err.println("Enter ending NO");
        int end = sc.nextInt();

        int sum1 = 0;
        for (int j = start; j <= end; j++) {
            int i = j; // if i use j in while directly it will become 0 
            // after loop is comeple so it will couse to screeze j++
            int sum = 0;
            while (i != 0) {
                int rem = i % 10;
                sum += rem;
                i /= 10;
            }
            sum1 += sum;
            System.err.println("sum of a number = " + sum);
        }
        System.err.println("sum of all from a given range = " + sum1);
    }
}
