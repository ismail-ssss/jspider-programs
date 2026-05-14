class P1_harshed {
    public static void main(String[] args) {
        int n = 81,b=n;
        // int sum = 0;
        // while (n != 0) {
        //     int rem = n % 10;
        //     sum += rem;
        //     n /= 10;
        // }
        if(b%sum(b)==0) System.out.println("harshed number");
        else System.out.println("Not a harshed number");
    }
    public static int sum(int n) {
        if(n==0)return 0;
        return n%10+sum(n/10);
    }
}
