class P1_palindrom{
    public static void main(String[] args) {
        // int n = 101,rev=0;
        // while(n!=0){
        //     int rem = n%10;
        //     rev = rev*10+rem;
        //     n/=10;
        // }
        System.out.println(rev(101,0));
    }
    public static int rev(int n,int rev){
        if(n==0) return rev;
        int rem = n%10;
        rev = rev*10+rem;
        return rev(n/10,rev);
    }
}