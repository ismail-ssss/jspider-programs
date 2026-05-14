
class P01_LinearSearch {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 5, 6, 7};
        System.err.println(ls(a, 2));
    }

    static int ls(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
