class P3_spy{
    public static void main(String[] args) {
        int n = 123, p=1, s=0;
        while(n!=0){
            int rem = n%10;
            p *= rem;
            s += rem;
            n/=10;
        }
        System.out.println(p);
        System.out.println(s);
    }
}