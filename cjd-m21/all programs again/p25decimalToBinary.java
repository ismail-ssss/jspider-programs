

class p25decimalToBinary {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.err.println("Enter decimal to get binary");
        int dec = 12;

        int bin = 0, i = 1;
        while (dec > 0) {
            int bit = dec % 2;
            bin += bit * i;
            i *= 10;
            dec /= 2;
        }
        System.err.println(bin);
    }
}
