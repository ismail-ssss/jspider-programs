import java.util.Scanner;

class dayNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day name, I will provide you number of that day");
        String d = sc.next().toLowerCase();

        switch (d) {
            case "monday" -> System.out.println("this is 01 day");
            case "tuesday" -> System.out.println("this is 02 day");
            case "wednesday" -> System.out.println("this is 03 day");
            case "thursday" -> System.out.println("this is 04 day");
            case "friday" -> System.out.println("this is 05 day");
            case "saturday" -> System.out.println("this is 06 day");
            case "sunday" -> System.out.println("this is 07 day");
            default -> System.out.println("invalid input");
        }

    }
}