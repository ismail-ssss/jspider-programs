
class p2a3b1c {

    public static void main(String[] args) {
        String s = "2a3b1c";// output aabbbc
        char[] c = s.toCharArray();
        for (int j = 0; j < c.length; j++) {
            if (c[j] >= '0' && c[j] <= '9') {
                int cc = c[j]-'0';
                while (cc > 0) {
                    System.out.print(c[j + 1]);
                    cc--;
                }
            }

        }
    }
}
