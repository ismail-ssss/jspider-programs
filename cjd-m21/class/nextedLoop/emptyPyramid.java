// import java.util.Scanner;
// class emptyDimond {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.err.println("Enter a number");
//         int n = sc.nextInt();
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j <= n - (i+1) ; j++) {
//                 System.err.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (i == n-1 || j == 1) {
//                     System.err.print("x");
//                 } else {
//                     System.err.print(" ");
//                 }
//             }
//             for (int j = 1; j < i; j++) {
//                 if (i == n-1 || j == i-1) {
//                     System.err.print("x");
//                 } else {
//                     System.err.print(" ");
//                 }
//             }
//             System.err.println();
//         }
//     }
// }
