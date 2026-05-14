
import java.util.Scanner;

class daysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month No");
        int m = sc.nextInt();

        // if you use (:) colun you have to provide break statement.
        // if you use (->) this arrow you'll not need to provide break statement.

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("invalid input");
        }
    }
}
