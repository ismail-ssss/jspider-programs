
import java.util.Arrays;

class mergeS{
    public static void main(String[] args) {
        int[]a={1,7,3,2,5,7};
        sort(a);
        System.err.println(Arrays.toString(a));
    }
    static void sort(int[]a){
        if(a.length==1)return;
        int[]left = new int[a.length/2];
        int[]right = new int[a.length-left.length];

        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);

        sort(left);
        sort(right);
        merge(left,right,a);
    }

    static void merge(int[]a,int[]b,int[]c){
        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length)c[k++] = a[i++];
        while(j<b.length)c[k++] = b[j++];
    }
}