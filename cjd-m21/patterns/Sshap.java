
import java.util.Scanner;

public class Sshap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||i==n/2+1||(i<n/2+1&&j==1)||(i>n/2+1&&j==5))
                System.err.print("x");
                else
                System.err.print(" ");
            }
            System.err.println();
        }
    }
}
