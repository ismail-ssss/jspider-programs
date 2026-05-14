
import java.util.Scanner;

class p2BigNO {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter first NO");
        int a = sc.nextInt();
        System.err.println("Enter second NO");
        int b = sc.nextInt();
        System.err.println("Enter third NO");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.err.println(a+" is big");
        } else if (b > a && b > c) {
            System.err.println(b+" is big");
        } else {
            System.err.println(c+" is big");
        }

    }
}
