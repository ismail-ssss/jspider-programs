class p13{
    public static void main(String[] args) {
        String s = "ismaili";
        char[]ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
        int count = 1;
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    ch[j] = '\u0000';
                    count++;
                }
            }
            if(count>1)ch[i] = '\u0000';
        }
        System.err.println(ch);
    }
}