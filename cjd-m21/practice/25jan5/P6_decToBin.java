class P6_decToBin{
    public static void main(String[] args) {
        // int dec = 1100, bin=0,i=1;
        // while(dec!=0){
        //     int rem = dec%10;
        //     bin = rem*i+bin;
        //     i*=2;
        //     dec/=10;
        // }
        System.out.println(bin(12,1,0));
        System.out.println(dec(1100,1,0));
    }
    public static int dec(int dec,int i,int bin){
        if(dec==0)return bin;
        int rem = dec%10;
        bin = rem*i+bin;
        return dec(dec/10,i*2,bin);
    }
    public static int bin(int bin,int i,int dec){
        if(bin==0)return dec;
        int rem = bin%2;
        dec = rem*i+dec;
        return bin(bin/2,i*10,dec);
    }
}