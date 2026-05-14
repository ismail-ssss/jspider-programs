class regexs{
    public static void main(String[] args) {
        String s = "java is easy";
        String s1 = "";
        String[] ch = s.split(" ");
        for(int i=0;i<ch.length;i++){
            char[] cc = ch[i].toCharArray();
            for (int j = cc.length; j >= 0; j--) {
                s1 += cc[j];  

            }
            s1+=" ";
        }
        System.err.println(s1);
    }
}