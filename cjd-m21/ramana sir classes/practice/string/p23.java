class p23{
    public static void main(String[] args) {
        String s = "2i1s3m1a2i2l";
        String res = "";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0'&&ch[i]<='9'){
                int count = ch[i]-'0';
                ch[i] = ch[i+1];
                for(int j = 0; j<count; j++){
                    res += ch[i];
                }
            }
        }
        System.err.println(res);
    }
}