class binarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 4, 5};
        System.out.println(search(a, 3));
    }

    static int search(int[] a, int key) {
        int st = 0;
        int end = a.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (key == a[mid]) {
                return mid; 
            }else if (key < a[mid]) {
                end = mid - 1; 
            }else if (key > a[mid]) {
                st = mid + 1;
            }
        }
        return -1;
    }
}
