class removeDup {
    public static void main(String[] args) {
        int[] ch = {2, 3, 4, 3, 2, 3, 4, 5, 6,2};
        int max = Integer.MAX_VALUE + 1;
        for (int i = 0; i < ch.length; i++) {
        int count = 1;
            if (ch[i] == max) {
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = max;

                    count++;
                }
            }
                if (count > 1) {
                    ch[i] = max;
                }
            if(ch[i]!=max)System.err.println(ch[i]);
        }
    }
}
