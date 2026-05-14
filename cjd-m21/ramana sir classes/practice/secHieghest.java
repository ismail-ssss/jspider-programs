class secHieghest{
    public static void main(String[] args) {
        String s = "ALISA";
        char ch[] = s.toCharArray();
        String res = "";
        // for(int i=ch.length-1; i>=0; i--){
        //     res += ch[i];
        // }
        for(Object e:ch){
            res += e;
        }
            System.err.println(res);
    }
}