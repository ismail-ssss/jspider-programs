class p24binaryToDecimal {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.err.println("Enter binary");
        int bin = 4;

        int i = 1, dec = 0;
        while (bin > 0) {
            int rem = bin%2;
            dec += (rem * i);
            i *= 10;
            bin /= 2;
        }
            System.err.println(dec);
    }
}
