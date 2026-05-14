class pacal {
    public static void main(String[] args) {
        int n = 5, sp = n-1, st = 1;
        int[][] a = new int[n][];
        pascal(a);
        for (int[] a1 : a) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print(a1[j] + " ");
            }
            // System.out.println(Arrays.toString(e));
            System.out.println();
            sp--;
            st++;
        }
    }

    static void pascal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || i == j) {
                    a[i][j] = 1; 
                }else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
    }
}
