
class p6 {

    public static void main(String[] args) {
        String s = "bca234";
        String ang = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(ch[i]>ch[j]){
                    char t = ch[i];
                    ch[i] = ch[j];
                    ch[j] = t;
                }
            }
                ang += ch[i];
        }
        System.err.println(ang);
    }
}
