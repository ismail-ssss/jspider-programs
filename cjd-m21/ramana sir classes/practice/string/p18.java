class p18{
    public static void main(String[] args) {
        String s = "ramana kumar";
        char[]ch = s.toCharArray();
        int count = 1, max = 0,max2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='\u0000')continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    System.err.println(count);
                    ch[j]= '\u0000';
                }
            }
            if(count>max){
                max2 = max;
                max = count;
            }else if(max2<count&&max!=count){
                max2 = count;
            }
        }
            System.err.println(max2);
    }
}