
import java.util.Scanner;

class p28HappyNO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = sc.nextInt();
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += (d * d);
                n /= 10;
            }
            n = sum;
        }
        if (n == 1) {
            System.err.println("It is a Happy number"); 
        }else {
            System.err.println("it is an unhappy number");
        }
    }
}
