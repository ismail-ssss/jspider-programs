import java.util.Arrays;
class p1{
    public static void main(String[] args) {
        int[]a = {12,24,41,43};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]%10>a[j]%10){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.err.println(Arrays.toString(a));
    }
}