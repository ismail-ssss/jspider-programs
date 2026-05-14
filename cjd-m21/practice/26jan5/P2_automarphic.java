class P2_automarphic{
    public static void main(String[] args) {
        // {76} = 76*76 = 57{76}
        int n = 76;
        int sq = n*n;
        boolean flag = true;
        while(n!=0){
            if(n%10!=sq%10){
                flag = false;
                break;
            }
                n/=10;
                sq/=10;
        }
        if(flag) System.out.println("automarphic");
        else System.out.println("not");
    }
}