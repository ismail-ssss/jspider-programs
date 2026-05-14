class linearSearchRecursion{
    public static void main(String[] args) {
        int[]a={5,3,6,2,7,8,9};
        System.err.println(find(a,7,0));
    }
    public static int find(int[] a,int key,int i){
        if(a.length==i) return -1;
        if(a[i]==key)return  a[i];
        return find(a,key,i+1);
    }
}