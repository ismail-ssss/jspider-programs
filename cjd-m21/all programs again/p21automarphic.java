
import java.util.Scanner;

class p21automarphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        boolean flag = true;

        while (n != 0) {
            if (n % 10 != sq % 10) {
                flag = false;
                break;
            }
            n /= 10;
            sq /= 10;
        }
        if (flag) {
            System.err.println("it is an automarphic"); 
        }else {
            System.err.println("it is not an automarphic");
        }
    }
}
