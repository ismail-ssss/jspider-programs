
class advPattern {

    public static void main(String[] args) {
        System.err.println("butterfly pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
        // opposite
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.err.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.err.print("*");
            }
            System.err.println();
        }

        System.err.println("solid Rhombus");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.err.print("*");
            }
            System.err.println();
        }

        System.err.println("Number Pyramid");
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.err.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.err.print(i+" ");
            }
            System.err.println();
        }
    
        System.err.println("Palindromic pattern");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.err.print("*");
            }
            System.err.println();
        }

    }
}
