
class p500 {

    public static void main(String[] args) {
        String s = "Java is easy";
        System.err.println(rev(s));
    }

    public static String rev(String s) {
        int i = 0, j = 0;
        String res = "";
        while (i < s.length()) {
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            int k = j - 1;
            while(k>=i){
                res += s.charAt(k);
                k--;
            }
            if(j<s.length()) res += " ";
            j++;
            i=j;
        }
        return res;
    }
}
