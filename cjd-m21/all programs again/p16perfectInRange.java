
import java.util.Scanner;

class p16perfectInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter starting NO");
        int start = sc.nextInt();
        System.err.println("Enter ending NO");
        int end = sc.nextInt();

        for (int j = start; j <= end; j++) {
        int sum = 0;
            if(j==1)sum+=1;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.err.println(sum + " and " + j);
            } 
            // else {
            //     System.err.println("not " + sum + " and " + j);
            // }
        }
    }
}
