import java.util.Scanner;
class numToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss;
        do {
            System.out.print("Enter the Amount : ");
            int n = sc.nextInt();
            pw(n / 10000000, " Crore ");
            pw(n / 100000 % 100, " Lakhs ");
            pw(n / 1000 % 100, " Thousand ");
            pw(n / 100 % 10, " Handrad ");
            pw(n % 100, "");
            System.err.println("\n\npres y to do again");
            ss = sc.next();
        } while ("y".equals(ss));
    }

    static void pw(int num, String s) {
        String[] one = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String[] two = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
        };
        if (num <= 19) {
            System.err.print(one[num]); 
        }else {
            System.err.print(two[num / 10] + " " + one[num % 10]);
        }
        if (num != 0) {
            System.err.print(s);
        }
    }
}
