
import java.util.Scanner;

public class snake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                int onum = (i-1)*n+1;
                for(int j=1; j<=n; j++){
                    System.err.print(onum+" ");
                    onum++;
                }
            }    else{
                 int enum1 = i*n;
                for(int j=1; j<=n; j++){
                    System.err.print(enum1+" ");
                    enum1--;
                }
            }        
            System.err.println();
        }
    }
}
