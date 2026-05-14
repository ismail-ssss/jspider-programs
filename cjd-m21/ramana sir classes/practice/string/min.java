class min{
    public static void main(String[] args) {
        String s = "rramanna  kuumarkk000";
        char[]ch = s.toCharArray();
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        char mc = ' ', mc2 = ' ';
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if(ch[i]=='\u0000')continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]= '\u0000';
                }
            }
                // System.err.println(count);
            if(count<min){
                min2 = min;
                min = count;
                mc2 = mc;
                mc = ch[i];
            }else if(count<min2&&min!=count){
                min2 = count;
                mc2 = ch[i];
            }
        }
            System.err.println(mc2 +" = "+min);
    }
}