
import java.util.Scanner;

class decimalTobinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter binary number");
        int n = sc.nextInt();
        String bin = "";
        while (n < 0) {
            int bit = n % 2;
            bin = bit + bin;
            n /= 2;
        }
            System.err.println(bin);

    }
}
