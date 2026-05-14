
import java.util.Scanner;

class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No");
        int a = sc.nextInt();
        System.out.println("Enter second No");
        int b = sc.nextInt();
        System.out.println("select operator");
        String c = sc.next();

        switch (c) {
            case "+" ->
                System.out.println(a + " + " + b + " = " + (a + b));
            case "-" ->
                System.out.println(a + " - " + b + " = " + (a - b));
            case "*" ->
                System.out.println(a + " * " + b + " = " + (a * b));
            case "/" ->
                System.out.println(a + " / " + b + " = " + (a / b));
            default ->
                throw new AssertionError();
        }
    }
}
