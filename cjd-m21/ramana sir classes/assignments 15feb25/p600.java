class p600 {
    public static void main(String[] args) {
        String s = "Java is easy";
        System.out.println(revSen(s));  // Expected output: "easy is Java"
    }

    public static String revSen(String s) {
        int i = s.length() - 1;
        String res = "";

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; // Skip trailing spaces
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') i--; // Find start of word
            
            if (j >= 0) {
                if (res.length() > 0) res += " "; // Add space between words
                
                for (int k = i + 1; k <= j; k++) {
                    res += s.charAt(k);
                }
            }
        }
        return res;
    }
}
