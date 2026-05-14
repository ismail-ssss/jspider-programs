
class p26 {

    public static void main(String[] args) {
        String s = "madam sir madam anthe";
        String[] str = s.split(" ");
        for (String e : str) {
            if (isPali(e)) {
                System.err.println(e);
            }
        }
    }

    static boolean isPali(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
