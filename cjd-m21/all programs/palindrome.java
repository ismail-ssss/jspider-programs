import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();

        int rev=0, temp=n;
        while (n!=0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }
        if(rev==temp)
        System.err.println("palindrome");
        else System.err.println("not");

    }
}