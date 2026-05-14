import java.util.Arrays;

class temp{

    public static void main(String[] args) {
        int[] a= {9,8,7,6,5,4,3,2,1};//7532 9864 1
        int[] b=new int[a.length];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(prime(a[i],a[i]/2)){
                b[count++]=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(!prime(a[i],a[i]/2)){
                b[count++]=a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
    static boolean prime(int n,int i){
        if(i==1)return true;
        if(n<2 || n%i==0)return false;
        return prime(n, i-1);
    }
}