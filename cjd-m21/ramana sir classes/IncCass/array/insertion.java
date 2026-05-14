import java.util.Arrays;
class insertion{
    public static void main(String[] args) {
        int[]a={9,1,3,5,2,3,4,3,2,3,4,7,8,1,1,};
        insert(a);
        System.err.println(Arrays.toString(a));
    }
    static void insert(int[]a){
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}