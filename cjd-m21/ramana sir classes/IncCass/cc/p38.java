
class p38 {

    public static void main(String[] args) {
        String s = "banana";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '\u0000') {
                continue;
            }
            System.err.print(ch[i] + "=" + i);
            for (int j = i + 1; j < s.length(); j++) {

                if (ch[i] == ch[j]) {
                    System.err.print("," + j);
                    ch[j] = '\u0000';
                }
            }
            System.err.println();

        }
    }
}
