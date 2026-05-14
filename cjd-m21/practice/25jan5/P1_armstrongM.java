
class P1_armstrongM {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n==arms(n,count(n)));
    }

    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + count(n/10);
    }

    public static int arms(int n, int c) {
        if (n == 0) {
            return 0;
        }
        return (int) Math.pow(n % 10, c)+arms(n / 10, c);
    }
}
