class p28{
    public static void main(String[] args) {
        String s = "Bengalure is a Bengalure city city city city";
        String[] ch = s.split(" ");
        for (int i = 0; i < ch.length; i++) {
        int count = 1;
            if(ch[i].equals(""))continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i].equals(ch[j])){
                    count++;
                    ch[j]="";
                }
            }
            System.err.println(ch[i]+" = \t"+count);                
        }
    }
}