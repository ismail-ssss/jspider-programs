class p6{
    // Arranging the charactores
    public static void main(String[] args) {
        String str = "JavaDev@123#";
        String u="",l="",s="",n="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z')u+=ch;
           else if(ch>='a'&&ch<='z')l+=ch;
           else if(ch>='0'&&ch<='9')n+=ch;
           else s+=ch;
        }
        System.out.println("Capital Letters = "+u);
        System.out.println("Small Letters = "+l);
        System.out.println("Numbers = "+n);
        System.out.println("Spacial Charactors = "+s);
    }
}