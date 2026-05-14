
import java.util.Scanner;

class p1EvenOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Please Enter the starting NO sir");
        int start = sc.nextInt();
        System.err.println("Please Enter the Ending NO sir");
        int end = sc.nextInt();

        int evenNO = 0, oddNO = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNO += 1; 
                System.err.println("e = "+i);
            }else {
                System.err.println(i);
                oddNO += 1;
            }
        }
        System.err.println("All even NO = "+evenNO+"\nAll odd NO = "+oddNO);
    }
}
