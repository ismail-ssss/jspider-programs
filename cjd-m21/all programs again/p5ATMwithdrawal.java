
import java.util.Scanner;

class p5ATMwithdrawal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Amount");
        int n = sc.nextInt();

        if (n >= 2000) {
            int a2000 = n / 2000;
            n%=2000;
            System.err.println("2000 is = " + a2000);
        }
        if (n > 500) {
            int a500 = n / 500;
            n%=500;
            System.err.println("500 is = " + a500);
        }
        if (n > 200) {
            int a200 = n / 200;
            n%=200;
            System.err.println("200 is = " + a200);
        }
        if (n > 100) {
            int a100 = n / 100;
            n%=100;
            System.err.println("200 is = " + a100);
        }
        if (n > 50) {
            int a50 = n / 50;
            System.err.println("50 is = " + a50);
        }
    }
}
