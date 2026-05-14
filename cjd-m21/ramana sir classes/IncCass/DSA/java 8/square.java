import java.util.function.Function;
class square{
    public static void main(String[] args) {
        // List<Integer> l = Arrays.asList(1,23,4,5,6,4,32,2);
        // List<Integer> a = l.stream().map(i->i*i).toList();
        // System.out.println(a);
        
        Integer[] b = {1,23,4,5,6,4,32,2};
        Function<Integer[],Integer[]> list = (aa) -> {
            for (int i = 0; i < aa.length; i++) {
                aa[i] = aa[i] * aa[i];
            }
            return aa;
        };
        for (Object e : list.apply(b)) {
            System.out.print(e+" ");
        }
    }
}