

class p27{
    public static void main(String[] args) {
        String s = "Bengalure is a Bengalure city";
        String[] ch = s.split(" ");
        String s2 = "";
        for (int i = 0; i < ch.length; i++) {
            if("".equals(ch[i]))continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i].equals(ch[j])){
                    ch[j]="";
                }
            }
            s2+=ch[i]+" ";
    
        }
        System.err.println(s2);
    }
}