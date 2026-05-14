class maxValue{
    public static void main(String[] args) {
        int [] a={1,2,5,7,8,2,0};
        int min=a[0];
        for(int i=1;i<a.length;i++) {
            min=Math.min(min, a[i]);
        }
        System.err.println(min);
    }
}