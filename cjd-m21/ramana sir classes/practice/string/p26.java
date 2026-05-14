public class p26 {
    public static void main(String[] args) {
        String s = "madam sir madam anthe";
        String[] ch = s.split(" ");
        for (String ch1 : ch) {
            if (pali(ch1, 0, ch1.length() - 1)) {
                System.err.println(ch1);
            }
        }
    }

    static boolean pali(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
