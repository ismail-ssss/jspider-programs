//     public static void main(String[] args) {
//         int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
//         int[][]b = new int[a.length][a.length];
//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a.length; j++){
//                 b[j][i] = a[i][j];
//             }
//         }
//         for(int[] n:b)System.out.print(Arrays.toString(n)+"\n");
//     }
// }
// class temp{
//     public static void main(String[] args) {
//         int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
//         int sum = 0;
//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a.length; j++){
//                 if(i==j)
//                 sum += a[i][j];
//             }
//         }
//         System.err.println(sum);
//     }
// }
class p3{
    public static void main(String[] args) {
        int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i+j==a.length-1)
                    sum += a[i][j];
            }
        }
        System.err.println(sum);
    }
}