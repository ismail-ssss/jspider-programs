
class paabccadd {

    public static void main(String[] args) {
        String s = "paaabbccaddddddd";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            if (c[i] == '\u0000') {
                continue;
            }
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] != c[j]) {
                    break;
                }
                count++;
                c[j] = '\u0000';
            }
            System.out.print(count + "" + c[i]);
        }
    }
}
