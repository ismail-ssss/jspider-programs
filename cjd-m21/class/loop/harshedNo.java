
import java.util.Scanner;

class harshedNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.err.println("harshed No"); 
        }else {
            System.err.println("not harshed No");
        }

    }
}
