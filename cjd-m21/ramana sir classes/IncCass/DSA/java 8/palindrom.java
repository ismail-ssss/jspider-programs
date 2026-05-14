
import java.util.function.Function;

class palindrom {

    public static void main(String[] args) {
        // String s = "madam";
        int a1 = 1012;
        Function<Integer,Integer> pali = (a) -> {
            int rev=0;
            while(a!=0){
                int rem = a%10;
                rev = rev*10+rem;
                a/=10;
            }
            return rev;
        };

        if (pali.apply(a1)==a1) 
            System.err.println("palindrom");
            else
            System.err.println("not palindrom");
    }
}
