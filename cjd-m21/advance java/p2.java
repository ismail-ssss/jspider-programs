class p2 {

    public static void main(String[] args) {
        int[] a = {7, 4, 2, 3, 8};
        int[] b = {9, 5, 6, 1, 10};
        int[] c = new int[a.length+b.length];
        // for (int i = 0; i < a.length; i++) {
        //     c[i] = a[i];
        // }
        int j = 0;
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[j];
            j++;
        }
        // System.err.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            if(c[i]%2==0){
                sort(c);
                System.err.print(c[i]+" ");
            }
        }
    }

    static void sort(int[]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
