
class p27 {

    public static void main(String[] args) {
        String s = "Bengluru is a Bengluru city";
        System.err.println(remDup(s));
    }

    static String remDup(String s) {
        String res = "";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                   str[j]=""; 
                }
            }
            res += str[i];
            res += " ";
        }
        return res.trim();
    }
}
