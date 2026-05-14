
import java.util.Arrays;
import java.util.List;

class even{
    public static void main(String[] args) {
        Integer[] a = {3,78,9,7,5,4,3,2};
        // Predicate<Integer> p = i-> i%2==0;
        // for (int i = 0; i < 10; i++) {
        //     if(p.test(a[i]))System.out.println(a[i]);
        // }

        List<Integer> list = Arrays.asList(a).stream().filter(i->i%2==0).toList();
        System.out.print(list);
    }
}