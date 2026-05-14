
import java.util.Scanner;

class operation {

    public static void main(String[] args) {
        do {
            Scanner s = new Scanner(System.in);
            System.err.println("\n\nEnter 1 to add 2 number\nEnter 2 to add 3 number\nEnter 3 to add more then 3 number");
            int n = s.nextInt();
            switch (n) {
                case 1 -> {
                    System.err.println("Enter first number: ");
                    int a = s.nextInt();
                    System.err.println("Enter second number: ");
                    int b = s.nextInt();
                    operation.add(a, b);
                }
                case 2 -> {
                    System.err.println("Enter first number: ");
                    int a1 = s.nextInt();
                    System.err.println("Enter second number: ");
                    int b1 = s.nextInt();
                    System.err.println("Enter third number: ");
                    int c1 = s.nextInt();
                    operation.add(a1, b1, c1);
                }
                case 3 -> {
                    System.err.println("Enter the rang to sum: ");
                    int a2 = s.nextInt();
                    int[] arr = new int[a2];
                    for (int i = 1; i <= a2; i++) {
                    System.err.println("Enter " + i+"/"+a2 + " numbers:");
                        arr[i] = s.nextInt();
                    }
                    operation.add(arr);
                }
                default ->
                    System.out.println("invalid number");
            }
        } while (true);
    }

    public static void add(int a, int b) {
        System.err.println("sum of two numbers = " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.err.println("sum of 3 numbers = " + (a + b + c));
    }

    public static void add(int... a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        System.err.println("sum all numbers = " + sum);
    }
}
