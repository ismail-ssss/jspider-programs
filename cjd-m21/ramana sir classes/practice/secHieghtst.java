
public class secHieghtst {

    public static void main(String[] args) {
        String s = "javaavaava";
        char ch[] = s.toCharArray();
        int h = 0;
        int sh = 0;
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '\u0000') {
                continue;
            }

            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';
                }

            }
            if (count > h) {
                
                h = count;
            } else if (count > sh && count != h) {
                sh = count;
            }
        }
        System.out.println(sh);
    }

}
