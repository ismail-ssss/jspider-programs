class P2_nyon{
    public static void main(String[] args) {
        int n = 9;
        int sq = n*n, sum=0;
        while(sq!=0){
            int rem = sq%10;
            sum += rem;
            sq/=10;
        }
        System.out.println(sum);
    }
}