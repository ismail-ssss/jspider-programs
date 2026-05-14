public class p25 {
    public static void main(String[] args) {
        String s = "qwwwrhhthjjjsssuusssiiii";
        String vowels = "aeiouAEIOU";
        char[] ch = s.toCharArray();

        for (char v : vowels.toCharArray()) {
            int count = 0;
            for (char c : ch) {
                if (c == v) {
                    count++;
                }
            }
            if (count > 2) {
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == v) {
                        ch[i] = '_';
                    }
                }
            }
        }

        System.out.println(new String(ch));
    }
}
