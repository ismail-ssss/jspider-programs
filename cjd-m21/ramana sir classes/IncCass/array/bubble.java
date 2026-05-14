
import java.util.Arrays;

class bubble{
    public static void main(String[] args) {
        int[]ch={2,3,5,4,3,2,1,3,7,1};
        Bsort(ch);
        System.err.println(Arrays.toString(ch));
    }
    static void Bsort(int[]c){
        for(int i=0; i<c.length-1;i++){
            for(int j=0; j<c.length-1-i; j++){
                if(c[j]>c[j+1]){
                    int t = c[j];
                    c[j] = c[j+1];
                    c[j+1] = t;
                }
            }
        }
    }
}