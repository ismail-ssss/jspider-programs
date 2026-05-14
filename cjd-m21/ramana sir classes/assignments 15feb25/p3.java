class p3{
    // print case count
    public static void main(String[] args) {
        String s = "JavaDev@12#@*";
        int uc = 0, nc = 0, sp = 0, lc = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') uc++;
            else if(ch >= 'a' && ch <= 'z') lc++;
            else if(ch >= '0' && ch <= '9') nc++;
            else sp++;
        }
        System.err.println("capital "+uc);
        System.err.println("small "+lc);
        System.err.println("digits "+nc);
        System.err.println("spaces "+sp);
    }
}