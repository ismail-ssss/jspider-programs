
import java.util.Scanner;

class binaryTodecimal {
// wrong program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter binary number");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; n != 0; i++) {
            count++;
            n /= 10;
        }

        int sum = 1, total = 0;
        String s;
        System.err.print(sum+" + ");
        for (int i = 2; i < count; i++) {
            sum *= 2;
            total += sum;
            s=sum + " + ";
            System.err.print(s);
        }
            sum *= 2;
            total += sum;
            s=sum + " + ";
        System.err.println(s+" = "+(total + 1));
    }
}
