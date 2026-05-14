import java.util.Scanner;
class timeSand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();
        // xxxxx
        //  x x
        //   x
        //  x x 
        // xxxxx
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==n||i==1|| j == i || j == n - i+1) {
                    System.err.print("x"); 
                }else {
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
}
