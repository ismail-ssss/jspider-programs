
import java.util.Arrays;

class bb{
    public static void main(String[] args) {
        int[] a = {2,3,21,4,3,2,45,6};
        bb(a);
        System.err.println(Arrays.toString(a));
    }

    public static void bb(int[] a) {
        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
}