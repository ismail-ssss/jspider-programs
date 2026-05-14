
import java.util.Scanner;

public class nn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            // int n1=5;
            for(int j=n; j>=i; j--){
                System.err.print(j);
                if(j!=i)System.err.print("* ");
                
            }
            System.err.println();
        }
    }
}
