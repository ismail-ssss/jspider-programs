import java.util.Arrays;
class p1 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] c = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int[]n:c) System.out.print(Arrays.toString(n)+"\n");
    }
}
