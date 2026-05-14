class repVowelMore3{
    public static void main(String[] args) {
        String s = "asdfaasdfa";
        String s1 = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
        int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(count > 3){
               s1 = s.replace(ch[i],'_');
            }   
        }
        System.err.println(s1);
    }
}