
import java.util.ArrayList;
import java.util.Collections;

class Arraylist{
    public static void main(String[] args) {
        int[]a={1,3,5,4,33,55,5};
        ArrayList<Integer>al= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(a[i]);
        }
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.set(1,555);
        Collections.sort(al);
        System.out.println(al);
    }
}