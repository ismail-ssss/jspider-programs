class p2_lcm{
    public static void main(String[] args) {
        int a =6, b=8;
        int n = a>b? a:b;
        int t =n;
        while(true){
            if(n%a==0&&n%b==0) break;
            n+=t;
        }
        System.err.println(n);
    }
}