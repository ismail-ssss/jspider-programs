class nyon{
    public static void main(String[] args) {
        System.out.println(nyon(9,9*9,0));
    }
    public static int nyon(int n,int sq,int sum){
        if (n==sum)return sum;
        sum+=(sq%10);
        return nyon(n,sq/10,sum);
    }
}