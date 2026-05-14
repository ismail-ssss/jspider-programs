class p17{
    public static void main(String[] args) {
        String s = "ramana kumar";
        char[]ch = s.toCharArray();
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='\u0000')continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]= '\u0000';
                }
            }
            System.err.println(ch[i]+" = "+count);
        }
    }
}