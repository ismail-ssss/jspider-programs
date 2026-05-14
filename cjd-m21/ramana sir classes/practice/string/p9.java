class p9{
    public static void main(String[] args) {
        String s = "my name is ismail";
        String strg = "";
        String[]s2 = s.split(" ");
        for (String s21 : s2) {
            for (int j = s21.length() - 1; j>=0; j--) {
                strg += s21.charAt(j);
            }
            strg += " ";
        }
    System.out.println(strg);
    }
}