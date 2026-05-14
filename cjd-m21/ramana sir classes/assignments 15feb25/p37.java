class p37{
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
         if (isAnagram(s1.toLowerCase(),s2.toLowerCase())) {
            System.err.println("Anagram"); 
        }else {
            System.err.println("not Anagram");
        }
    }
    static boolean isAnagram(String s1,String s2){
            if(s1.length()!=s2.length())return false;
            else if(s1.length()==0 && s2.length()==0) return true;
            char ch = s1.charAt(0);
        return isAnagram(s1.replace(ch+"", ""), s2.replace(ch+"", ""));
    }
}