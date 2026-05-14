class p37{
    public static void main(String[] args) {
        String s = "abc";
        isPermutation(s,0,s.length());
    }
    static void isPermutation(String s,int st,int end){
        
        if(st==end) {
            System.err.println(s);
            return;
        }
        for(int i=st; i<end;i++){
            String s1 = swap(s,st,i);
            isPermutation(s1, st+1, end);
        }
    }
    public static String swap(String s,int i,int j) {
        char[]ch=s.toCharArray();
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        return new String(ch);
    }
}