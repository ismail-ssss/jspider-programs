import java.util.Scanner;
class P3_prime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do { 
            int n = s.nextInt();
            if(prime(n,n/2))System.out.println(n+" is prime");
            else System.out.println(n+ " not a prime");
        } while (true);
    }
    public static boolean  prime(int n,int f) {
        if(f==1) return true;
        if(n%f==0)return false;
        return prime(n,f-1);
    }
}