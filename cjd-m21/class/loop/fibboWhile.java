import java.util.Scanner;

class fibboWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f0 = 0, f1 = 1;
        System.err.println(f0+"\n"+f1);
        while(n!=2){
            int f2 = f0 + f1;
            f1 = f2;
            f0 = f1;
            System.err.println(f2);
            n--;
        }
    }
}