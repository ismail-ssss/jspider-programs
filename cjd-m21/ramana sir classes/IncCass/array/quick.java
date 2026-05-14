import java.util.Arrays;
class quick {
    public static void main(String[] args) {
        int[] a = {8, 4, 5, 3, 6};
        sortQ(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void sortQ(int[] a, int st, int end) {
        if (st >= end) {
            return;
        }
        int i = st;
        int j = end;
        int p = a[(st + end) / 2];
        while (i < j) {
            while (a[i] < p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i <= j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }
        sortQ(a, st, j);
        sortQ(a, i, end);
    }
}
