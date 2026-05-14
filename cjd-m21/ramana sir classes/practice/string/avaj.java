 class avaj {
    public static void main(String[] args) {
        String sw = "java is easy";
        String s = "", w = "";
        for (int i = sw.length()-1; i >= 0; i--) {
            char ch = sw.charAt(i);
            if (ch != 32) {
                w = ch + w;
            } else {
                if (s.equals("")) {
                    s = w;
                    w="";
                }else {
                    s = s + " " + w;
                    w = "";
                }
            }
        }
        s = s + " " + w;
        System.err.println(s);
    }
}
