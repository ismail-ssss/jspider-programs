class NumberToWord {
    public static void main(String[] args) {
        int n = 1550;
        helper(n);
    }
    static void helper(int n){
        pw(n / 10000000, " Crore ");
        pw(n / 100000 % 100, " Lakhs ");
        pw(n / 1000 % 100, " Thousand ");
        pw(n / 100 % 10, " Handrad ");
        pw(n % 100, "");
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
            System.out.print(one[num]);
        } else {
            System.err.print(two[num / 10] + " " + one[num % 10]);
        }
        if (num != 0) {
            System.err.print(s);
        }
    }

}
