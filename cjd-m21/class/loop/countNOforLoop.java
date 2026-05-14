import java.util.Scanner;

class countNOforLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(;n!=0;){
         count ++;
            n/=10;
        }
        System.err.println(count);
    }
}