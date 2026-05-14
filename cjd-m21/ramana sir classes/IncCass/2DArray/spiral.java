import java.util.Arrays;
class spiral {
    public static void main(String[] args) {
        int n = 5, row = 0, col = -1, c = 1;
        char dir = 'r';

        int[][] a = new int[n][n];
        for (int i = 1; i <= n * n; i++) {
            switch (dir) {
                case 'r' -> {
                    col++;
                    a[row][col] = c;
                    if (col == a.length - 1 || a[row][col + 1] != 0) {
                        dir = 'd';
                    }
                }
                case 'd' -> {
                    row++;
                    a[row][col] = c;
                    if (row == a.length - 1 || a[row + 1][col] != 0) {
                        dir = 'l';
                    }
                }
                case 'l' -> {
                    col--;
                    a[row][col] = c;
                    if (col == 0 || a[row][col - 1] != 0) {
                        dir = 'u';
                    }
                }
                case 'u' -> {
                    row--;
                    a[row][col] = c;
                    if (col == a.length - 1 || a[row - 1][col] != 0) {
                        dir = 'r';
                        c++;
                    }
                }
            }
        }

        for (int[] n1 : a) {
            System.out.println(Arrays.toString(n1) + "\t");
        }
    }
}
