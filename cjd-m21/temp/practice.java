import java.util.Scanner;

class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();
        String s = " ";
        int res = 1;
        for(int i=1; i<=n; i++){
            res*=i;
            s+=i;
            if(i<n)s+="*";
        }
        String ans = s+"="+res;
        System.err.println(ans);
    }
}