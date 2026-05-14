class P2_perfect{
    public static void main(String[] args) {
        int n = 6;
        System.out.println(perfect(n,n/2,0));
    }
    public static int perfect(int n,int f,int sum) {
        if(f==0)return sum;
        if(n%f==0) sum+=f;
        return perfect(n, f-1, sum);
    }
}