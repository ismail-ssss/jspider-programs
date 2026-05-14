
import java.util.Scanner;

class electricity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit");
        int u = sc.nextInt();
        System.out.println("Enter balance");
        int bal = sc.nextInt();

        double amt = 0;
        if (u <= 50) {
            System.out.println("electricity is free to 50 unit");
        } else if (u <= 100) {
            amt = (u - 50) * 2;
        } else if (u <= 150) {
            amt = (50 * 2) + ((u - 100) * 5);
        } else if (u <= 200) {
            amt = (50 * 2) + (50 * 5) + ((u - 150) * 9);
        } else {
            amt = (50 * 2) + (50 * 5) + (50 * 9) + ((u - 200) * 16);
        }

        System.out.println("Current month bill = " + amt + " rs");

        double totalAmount;
        double cess = 0.0;
        // adding tax to balanced amt
        if (amt > 900) {
            cess = (amt * 1.5) / 100;
        }
        System.out.println("cess = " + cess + " rs");

        totalAmount = amt + cess;
        System.out.println("bill after adding cess = " + totalAmount + " rs");

        double fine = 0;
        if (bal > 0) {
            fine = (bal * 10) / 100;
        }
        System.out.println("balance = " + bal + " rs");
        System.out.println("fine = " + fine + " rs");

        totalAmount = totalAmount + bal + fine;
        System.out.println("total balance = " + totalAmount);
    }
}
