
class P5_strong {

    public static void main(String[] args) {
        int n = 145;
        if (n == strong(n)) {
            System.out.println(n + " is a strong number"); 
        }else {
            System.out.println(n + " is not a strong number");
        }
    }

    public static int strong(int n) {
        if (n == 0) {
            return 0;
        }
        return fact(n % 10) + strong(n / 10);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
