class p21{
    public static void main(String[] args) {
        String s = "ramana kumar";
        char[]ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]>ch[j]){
                    char t = ch[i];
                    ch[i] = ch[j];
                    ch[j] = t;
                }
            }
        }
        System.err.println(ch);
    }
}