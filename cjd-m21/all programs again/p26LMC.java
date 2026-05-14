
import java.util.Scanner;

class p26LMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter first number to LCM");
        int a = sc.nextInt();
        System.err.println("Enter second number to LCM");
        int b = sc.nextInt();

        int n = a > b ? a : b;
        int temp=n;

        while(true){
            if(n%a==0 && n%b==0)break;
            n+=temp;
        }
        System.err.println(n);
    }
}
