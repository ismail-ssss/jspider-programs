
import java.util.Scanner;

class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to iterate : ");
        int n = sc.nextInt();
        int fact = 1, i = 1;
        for (; i <= n; i++) {
            fact *= i;
            System.err.print(i);
            if(i<n)
            System.err.print("x");
        }
        System.err.println(" = " + fact);
    }
}
