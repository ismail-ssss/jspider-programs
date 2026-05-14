
public class anagaram {

    public static void main(String[] args) {
        String s = "race";
        String s1 = "Care";
        System.err.println(anagram(s, s1));
        anagram2(s.toLowerCase(),
        s1.toLowerCase());
        System.out.println(recursionAna(s1.toLowerCase(),
        s1.toLowerCase(), 1));
    }

    static boolean anagram(String s, String s2) {
        s = s.toLowerCase();
        s2 = s2.toLowerCase();
        if (s.length() != s2.length()) {
            return false;
        }
        if (s.length() == 0 && s2.length() == 0) {
            return true;
        }

        String newS2 = "";
        boolean found = false;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s.charAt(0)) {
                found = true;
            } else {
                newS2 += s2.charAt(i);
            }
        }
        if (!found) {
            return false;
        }
        return anagram(s.substring(1), newS2);
    }

    static void anagram2(String s, String s2) {
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char aa1 = s.charAt(i);
            if (aa1 == '\u0000') {
                continue;
            }
            for (int j = 0; j < s2.length(); j++) {
                char bb2 = s2.charAt(j);
                if (aa1 == bb2) {
                    aa1 = '\u0000';
                    // bb2 = '\u0000';
                    count++;
                }
            }
        }
        if (count == s.length()) {
            System.err.println("anagram"); 
        }else {
            System.err.println("not");
        }
    }

    static boolean recursionAna(String s1,String s2,int i){
        if(i==s2.length())return true;
        if(s1.length()==0&&s2.length()==0)return true;
        if(s1.length()!=s2.length())return false;
        if(s1.contains(s2.charAt(i)+""))
            return true;
        return recursionAna(s1, s2, i+1);
    }

}
