
import java.util.Arrays;
class user {

    public static void main(String[] args) {
        Student e1 = new Student("apna", 23, 88);
        Student e2 = new Student("sapna", 33, 77);
        Student e3 = new Student("money", 22, 66);
        Student e4 = new Student("hany", 17, 99);
        Student[] e = {e1, e2, e3, e4};
        Arrays.sort(e);
        for (Object emp : e) {
            System.out.println(emp);
        }
    }
}
