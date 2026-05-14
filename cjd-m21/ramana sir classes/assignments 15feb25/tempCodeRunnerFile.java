
    public static void main(String[] args) {
        String s = "javadev";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if(ch[i]=='\u0000')continue;
            for (int j = 0; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            System.err.println(ch[i]+"="+count);
        }
        // for (Object e : ch){