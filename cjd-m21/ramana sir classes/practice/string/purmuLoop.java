class purmuLoop{
    public static void main(String[] args) {
        String s = "abcd";
        char[]ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String s1 = s;
            for (int j = 0; j < ch.length; j++) {
                if(ch[i]!=ch[j]){
                  String s2 = s1.replace(ch[j]+"", "");
                  String s3 = s2.replace(ch[i]+"", "");
                  System.err.println(ch[i]+""+ch[j]+""+s3);
                }
            }
        }
    }
}