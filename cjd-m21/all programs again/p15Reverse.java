import java.util.Scanner;

class p15Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Number");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }
        System.err.println(rev);
    }
}