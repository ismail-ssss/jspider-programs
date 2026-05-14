public class p24 {    
    public static void main(String[] args) {
        String s = "wwwhhhjjjsss";
        String s2 = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                s2 += count + "" + s.charAt(i - 1);
                count = 1;
            }
        }
        s2 += count + "" + s.charAt(s.length() - 1);
        
        System.out.println(s2);
    }
}
