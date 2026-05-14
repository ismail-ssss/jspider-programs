
import java.util.Scanner;

class sumOfnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0; i<=n; i++){
            int rm = n%10;
            for(int j=1; j<=rm; j++){
                sum += j;
            }
        }
        System.err.println(sum);
    }
}
