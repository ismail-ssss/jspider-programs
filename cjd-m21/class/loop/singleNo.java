import java.util.Scanner;

class singleNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter No");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
            if(n==0 && sum>9){
                System.err.println(sum);
                n=sum;
                sum=0;
            }
        }
        System.err.println(sum);
    }
}