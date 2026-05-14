
import java.util.Scanner;

class binaryTodecimal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter binary number");
        int bin = sc.nextInt();

        int i = 1,dec=0;
        while (bin > 0) {
            int bit = bin%10;
            dec +=  (bit*i);
            i*=2;
            bin/=10;
        }
        System.err.println(dec);

    }
}
