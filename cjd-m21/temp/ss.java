
class ss {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "pqrst";//a p b q c r s t
        String s3 = "";

        for (int i = 0; i < s2.length()-1; i++) {
            if (i < s.length()) {
                s3 += s.charAt(i)+" ";
            }
            s3 += s2.charAt(i)+" ";
        }
        s3 += s2.charAt(s2.length()-1)+" ";

        System.err.println(s3);
    }
}
