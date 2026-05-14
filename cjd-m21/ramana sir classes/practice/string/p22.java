
class p22 {

    public static void main(String[] args) {
        String s = "hello world";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char count = '1';
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = count;
                }
            }
            if (count != '1') {
                ch[i] = '1';
            }
        }
            System.err.print(ch);
    }
}
