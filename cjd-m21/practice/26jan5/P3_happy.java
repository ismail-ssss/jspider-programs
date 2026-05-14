class P3_happy{
    public static void main(String[] args) {
        int n = 12;
        while(n!=1 && n!=4){
            int sq=0;
            while(n>0){
                int rem = n%10;
                sq += rem*rem;
                n/=10;
            }
            n = sq;
        }
        System.out.println(n);        
    }
}