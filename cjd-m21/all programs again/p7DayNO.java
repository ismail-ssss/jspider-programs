import java.util.Scanner;

class p7DayNO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter day");
        String day = sc.next().toLowerCase();

        switch (day) {
            case "monday" -> System.err.println("monday is 1 day");
            case "tuesday" -> System.err.println("tuesday is 2 day");
            case "wednesday" -> System.err.println("wednesday is 3 day");
            case "thursday" -> System.err.println("thursday is 4 day");
            case "friday" -> System.err.println("friday is 5 day");
            case "saturday" -> System.err.println("saturday is 6 day");
            case "sunday" -> System.err.println("sunday is 7 day");
            default -> System.err.println("invalid input");
        }
    }
}