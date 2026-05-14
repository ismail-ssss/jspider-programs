
class removeVowelsaddcount {

    public static void main(String[] args) {
        String s = "this is a good";//ths s g1d;
        char[] ch = s.toCharArray();
        String ss = "aeiouAEIOU";
        for (int k = 0; k < ch.length; k++) {
            int count = 1;
            if (ch[k] == '\u0000') {
                continue;
            }
            for (int j = k + 1; j < ch.length; j++) {
                if (ch[k] != ch[j]) {
                    break;
                }
                count++;
                ch[j] = '\u0000';
            }
            if (ss.contains(ch[k] + "")) {
                ch[k] = '\u0000';
            }

            if (count >= 2) {
                ch[k] = (char) (count-1 + '0');
            }
        }

        System.out.println(ch);
    }
}
