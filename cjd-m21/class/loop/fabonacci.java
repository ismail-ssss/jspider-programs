
import java.util.Scanner;

class fabonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f1 = 0, f2 = 1, f3;
        System.err.println(f1);
        System.err.println(f2);

        for(int i = 0 ; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.err.println(f3);
        }
    }
}
