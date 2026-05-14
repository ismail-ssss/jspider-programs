class anagaramReplace{
    public static void main(String[] args) {
        String s = "care1";
        String s2 = "race";
        
        if(anagaram(s, s2))System.err.println("anagaram");
        else System.err.println("not");
    }
    public static boolean  anagaram(String s,String s2) {
        if(s.length()!=s2.length())return false;
        if(s.length()==0&&s2.length()==0)return false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s.charAt(i)==s2.charAt(j)){
                    s2 = s2.replace(s2.charAt(j)+"", "");
                }
            }
        }
        return true;
    }
}