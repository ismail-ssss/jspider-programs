import java.util.Scanner;

class p13palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n,sum=0;
        while(n!=0){
            int rem = n%10;
            sum = (sum*10)+rem;
            n/=10;
        }
        System.err.println(sum);
        if(temp==sum)
        System.err.println("palindrom");
        else
        System.err.println("not palindrom");

    }
}