class p16{
    public static void main(String[] args) {
        String s = "ismail ji hello";
        char[]ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(i == 0 || ch[i-1]==' '){
                ch[i] -= 32;
            }
        }
        System.err.println(ch);
    }
}