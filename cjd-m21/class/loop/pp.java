
import java.util.Scanner;

class pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        String s = "";

        for (int i = 1; i <= 10; i++) {
            s+=n+" x "+i+" = "+(n*i)+"\n";
        }
            System.err.println(s);
    }
}
