
import java.util.Scanner;

//harshed number which is divisible by its sum 
// ex  21
//     2+1
//     21/3 = 7
class p12HarshedNO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.err.println("harshed NO");
        } else {
            System.err.println("not harshed NO");
        }
    }
}
