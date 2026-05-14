import java.util.Scanner;

class automarphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        boolean flag = true;

        while(n>0){
            if(n%10!=sq%10){
                flag=false;
                break;
            }
            n/=10; sq/=10;
        }
        if(flag) System.err.println("Automorphic");
        else System.err.println("not an automorphic");
    }
}