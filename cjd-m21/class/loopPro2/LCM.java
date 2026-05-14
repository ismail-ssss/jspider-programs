import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter first number");
        int a = sc.nextInt();
        System.err.println("Enter first number");
        int b = sc.nextInt();
        
        int n = a>b ? a:b;
        int temp = n;

        while (true) { 
            if(n%a==0 && n%b==0){
                int rem = n%a;
                int remb = n%b;
                System.err.println("rem="+rem+" remb="+remb);
            System.err.println("n="+n+" a="+a+" b="+b);
                break;
            }
            n+=temp;
        }
        System.err.println(n);
    }
}