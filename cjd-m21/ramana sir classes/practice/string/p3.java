class p3{
    public static void main(String[] args) {
        String s = "Ismail@123";
        int cl = 0, sl = 0, n=0, sp=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z') cl++;
            else if(ch>='a'&&ch<='z') sl++;
            else if(ch>='0'&&ch<='9') n++;
            else sp++;
        }
        System.err.println("cl="+cl);
        System.err.println("sl="+sl);
        System.err.println("n="+n);
        System.err.println("sp="+sp);
    }
}