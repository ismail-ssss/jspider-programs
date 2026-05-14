class purmutation{
    public static void main(String[] args) {
        String s = "abc";
        permu(s,"");
    }

    static void permu(String str,String p){
        if(str.length()==0){
            System.err.println(p);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permu(str.substring(0,i)+str.substring(i+1),p+str.charAt(i));
        }
    }
}