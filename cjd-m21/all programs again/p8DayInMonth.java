
import java.util.Scanner;

class p8DayInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter month number");
        int month = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.err.println(31);
            case 4, 6, 9, 11 -> System.err.println(30);
            case 2 -> {
                System.err.println("Enter year");
                int y = sc.nextInt();
                if ((y % 400 == 0) || y % 4 == 0 && y % 100 != 0) {
                    System.err.println(29);
                } else {
                    System.err.println(28);
                }
            }
            default -> System.err.println("invalid input");
        }
    }
}
