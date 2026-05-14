
class p2 {

    public static void main(String[] args) {
        String s = "Ismail";
        String vow = "aeiouAEIOU";
        char[] ch = vow.toCharArray();
        int count = 0;
        for (int i = 0; i < vow.length(); i++) {
            if (s.contains(ch[i]+"")) {
                count++;
            }
        }
        System.err.println(count);
    }
}
