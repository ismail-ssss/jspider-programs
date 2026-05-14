class linearS_1{
    public static void main(String[] args) {
        int[]a={5,3,6,2,7,8,9};
        System.err.println(find(a,7));
    }
    public static int find(int[] a,int key) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key)return  i;
        }
            return -1;
    }
}