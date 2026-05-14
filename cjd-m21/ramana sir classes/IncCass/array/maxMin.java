class maxMin{
    public static void main(String[] args) {
        int[] a = {1,3,2,3,4,6,7};
        int m = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<m){
                m2 = m;
                m = a[i];
            }else if(a[i]<m2&&m!=a[i])
                m2 = a[i];
        }
        System.err.println(m);
        System.err.println(m2);
    }
}