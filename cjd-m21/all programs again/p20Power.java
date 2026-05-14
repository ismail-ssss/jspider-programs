import java.util.Scanner;

class p20Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod=1;
        for(int i=1; i<=4; i++){
            prod*=n;
        }

        System.err.println(prod);
    }
}