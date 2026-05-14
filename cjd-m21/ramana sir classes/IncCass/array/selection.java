
import java.util.Arrays;

class selection{
    public static void main(String[] args) {
        int[]a={9,1,3,5,7};
        selec(a);
        System.err.println(Arrays.toString(a));
    }
    static void selec(int[]a){
        for(int i=0; i<a.length-1; i++){
            int index = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[index]){
                    index = j;
                }
            }
            int t = a[i];
            a[i] = a[index];
            a[index] = t;
        }
    }
}