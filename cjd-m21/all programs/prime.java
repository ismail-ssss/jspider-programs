import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();
        boolean flag = true;
        
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag) System.err.println("prime");
        else System.err.println("not a prime");
    }
}