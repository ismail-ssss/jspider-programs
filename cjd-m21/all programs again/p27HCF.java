import java.util.Scanner;

class p27HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        // Inline calculation of HCF using Euclidean Algorithm
        while (b != 0) {
            int temp = b;// 18 // 12 // 6
            b = a % b; // 48 % 18 = 12 // 12 % 18 = 6 // 6%12=612
            a = temp; // 18 // 12 //
        }

        System.out.println("HCF of the given numbers is: " + a);
    }
}
