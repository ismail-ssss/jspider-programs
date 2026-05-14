class reverseWord {
    public static void main(String[] args) {
        String s = "java is very easy";
        System.out.println(rev(s));
        revs(s);
    }
    static String rev(String s) {
        int i = s.length() - 1;
        int j = s.length() - 1; 
        String res = "";
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            int k = i + 1;
            while (k <= j) {
                res += s.charAt(k++);
            }
            if (i > 0) {
                res += " ";
            }
            i--;
            j = i;
        }
        return res;
    }

    static void revs(String s) {
        //java is very easy
        String w = "", ss = "";
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != 32) {
                w = ch + "" + w;
            } else {
                    ss += w+" ";
                    w = "";
            }
        }
        ss += w;
        System.out.println(ss);
    }
}
