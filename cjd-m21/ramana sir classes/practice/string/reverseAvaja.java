
class reverseAvaja {

    public static void main(String[] args) {
        String s = "java is very easy";
        System.out.println(rev(s));
        revs(s);
    }

    static String rev(String s) {
        int i = 0;
        int j = 0;
        String res = "";
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            int k = i - 1;
            while (k >= j) {
                res += s.charAt(k--);
            }
            if (i < s.length()) {
                res += " ";
            }
            i++;
            j = i;
        }
        return res;
    }

    static void revs(String s) {
        String w = "", ss = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 32) {
                w = ch + "" + w;
            } else {
                if ("".equals(ss)) {
                    ss = w;
                    w = "";
                } else {
                    ss = ss + " " + w;
                    w = "";
                }
            }
        }
        ss = ss + " " + w;
        System.out.println(ss);
    }
}
