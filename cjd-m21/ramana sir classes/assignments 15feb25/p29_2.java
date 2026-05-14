
class p29_2 {

    public static void main(String[] args) {
        String s = "malayalam";
        String bigSubPali = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 3; j < s.length(); j++) {
                String str = s.substring(i, j);
                if (isPali(str)) {
                    System.err.println(str);
                    if (str.length() > bigSubPali.length()) {
                        bigSubPali = str;
                    }
                }
            }
        }
        System.err.println("=========");
        System.err.println(bigSubPali);
    }

    static boolean isPali(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
