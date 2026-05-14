import java.util.Scanner;

class p14fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Number");
        int n = sc.nextInt();

        int f1=0, f2=1,f3;
        for(int i=1; i<=n; i++){
            System.err.println(f1);
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        
    }
}