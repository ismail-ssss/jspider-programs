
import java.util.Scanner;

class prod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();
        System.err.println("Enter power");
        int p = sc.nextInt();

        int prod = 1;
        for (int i = 1; i <= p; i++) {
            prod *= n;
        }
        System.err.println(prod);
    }
}
