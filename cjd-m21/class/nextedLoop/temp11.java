import java.util.Scanner;
class temp11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==n/2+1){
                    System.err.print("*");
                }
            System.err.println();
            }
        }
    }
}
