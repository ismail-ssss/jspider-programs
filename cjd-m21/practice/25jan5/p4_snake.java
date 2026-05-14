class p4_snake{
    public static void main(String[] args) {
        int n = 5,cn=1;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                for(int j=1; j<=i; j++)
                    System.out.print(cn++);
            }else{
                int end = cn+i-1;
                for(int j=end; j>=cn; j--)
                    System.out.print(j);
                cn = end+1;
            }
            System.out.println();
        }
    }
}