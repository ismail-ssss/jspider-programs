class P3_hcf{
    public static void main(String[] args) {
        int a = 48, b = 12;
        int n = a<b? a:b;
        int f = n/2;
        while(true){
            if(a%f==0&&b%f==0)break;
                f--;
        }
        System.out.println(f);
    }
}