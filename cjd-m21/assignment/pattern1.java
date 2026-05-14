
import java.util.Scanner;

class pattern1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int size = sc.nextInt();

        // 1 question
        // x   x
        //  x x 
        //   x
        //  x x
        // x   x

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == size-i+1 || j==i ) {
                    System.err.print("X");
                }else{
                    System.err.print("_");
                }
            }
            System.err.println();
        }
        System.err.println();

        // 2 question
        // 12345
        // 54321
        // 12345
        // 54321
        // 12345
        
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= size; j++) {
                    System.err.print(j+" ");
                } 
            }else {
                int lineNo = size;
                for (int j = 1; j <= size; j++) {
                    System.err.print(lineNo+" ");
                    lineNo--;
                }
            }
            System.err.println();
        }
    }
}
