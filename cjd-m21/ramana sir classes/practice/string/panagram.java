class panagram {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.err.println(panagram(s,'a'));
    }

    public static boolean  panagram(String s,char i) {
        if(i>'z')return true;
        s = s.toLowerCase();
        if(s.length()<26)return false;
        // String s2 = "abcdefghijklmnopqrstuvwxyz";
            if(!s.contains(i+"")){
                 return false; 
            }
        return panagram(s,++i);
    }
}
