
class bothDiagonalSum {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {1, 3, 4}, {1, 6, 5}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
            if (i != a.length - 1 - i) {
                sum += a[i][a.length - 1 - i];
            }
        }
        System.err.println(sum);
    }
}
