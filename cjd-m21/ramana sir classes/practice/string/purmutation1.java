class purmutation1{
    public static void main(String[] args) {
        String s = "abcz";
        ispermu(s,0,s.length());
    }
    static void ispermu(String s,int st,int end){
        if(st==end){
            System.out.println(s);
            return;
        }
        for(int i=st;i<end;i++){
            String s1 = swap(s,st,i);
            ispermu(s1, st+1, end);
        }
    }

    static String swap(String s,int i,int j){
        char[]ch = s.toCharArray();
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        return new String(ch);
    }

}