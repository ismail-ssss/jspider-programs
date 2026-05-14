class p20{
    public static void main(String[] args) {
        String s = "ramana kumar";
        char[]ch = s.toCharArray();
        int count = 1, max = 0, max2 = 0;
        char maxChar = ' ', maxChar2 = ' ';
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='\u0000')continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]= '\u0000';
                }
            }
            System.err.println(ch[i]+" = "+count);
            if(count>max){
                max2 = max;
                max = count;
                maxChar2 = maxChar;
                maxChar = ch[i];
            }else if(count>max && max!=count){
                max2 = count;
                maxChar2 = ch[i];
            }
        }
            System.err.println("======");
            System.err.println(maxChar+" = "+max);
            System.err.println(maxChar2+" = "+max2);
    }
}