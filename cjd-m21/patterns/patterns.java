
class patterns {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.err.println("Enter number : ");
        int n = 4;
        int m = 5;
        //if (i % 3 == 0)  break; it use to a void number 3
        System.err.println("solid rectangle");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.err.print(" * ");
            }
            System.err.println();
        }
        System.err.println();

        System.err.println("hollow rectangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.err.print(" * ");
                } else {
                    System.err.print("   ");
                }
            }
            System.err.println();
        }
        System.err.println();

        System.err.println("half pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(" * ");
            }
            System.err.println();
        }
        System.err.println();

        System.err.println("Inverted half pyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print(" * ");
            }
            System.err.println();
        }
        System.err.println();

        System.err.println("inverted half pyramid(rotated by 180 deg)");

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }

        System.err.println();

        System.err.println("half pyramid with numbers");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(j);
            }
            System.err.println();
        }

        System.err.println();

        System.err.println("inverted half pyramid with numbers");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print(j);
            }
            System.err.println();
        }

        System.err.println();

        System.err.println("floyd's Triangle");
        int nn = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(nn + " ");
                nn++;
            }
            System.err.println();
        }

        System.err.println();

        System.err.println("0-1 Triangle");
        int kk = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (kk % 2 == 0) {
                    System.err.print(0 + " "); 
                }else {
                    System.err.print(1 + " ");
                }
                kk++;
            }
            System.err.println();
        }

        System.err.println();
    }
}
