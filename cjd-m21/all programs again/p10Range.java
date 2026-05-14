
import java.util.Scanner;

class p10Range {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Please Enter the starting NO sir");
        int start = sc.nextInt();
        System.err.println("Please Enter the Ending NO sir");
        int end = sc.nextInt();

        int range = 0;
        for (int i = start; i < end; i++) {
            range += 1;
        }
        System.err.println(range);
    }
}
