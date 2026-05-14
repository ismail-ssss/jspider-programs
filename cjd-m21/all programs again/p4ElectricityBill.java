
import java.util.Scanner;

class p4ElectricityBill {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter unit");
        int u = sc.nextInt();
        System.err.println("Enter balance");
        int bal = sc.nextInt();

        int amt;
        double cess = 0, totalBill;

        if (u <= 50) {
            amt = 50 * 0;
            System.err.println("50 unit is free");
        } else if (u <= 100) {
            amt = (u - 50) * 2;
        } else if (u <= 150) {
            amt = (50 * 2) + (u - 100) * 5;
        } else if (u <= 200) {
            amt = (50 * 2) + (50 * 5) + (u - 150) * 9;
        } else {
            amt = (50 * 2) + (50 * 5) + (50 * 9) + (u - 200) * 16;
        }
        System.err.println("Amount = " + amt);

        if (amt > 900) {
            cess = (amt * 1.5) / 100;
            System.err.println("including cess = " + cess);
        }

        if (bal > 0) {
            bal = (bal * 10) / 100;
            System.err.println("Balance added interest = " + bal);
        }

        totalBill = (bal + cess + amt);
        System.err.println("total bill is = " + totalBill);
    }
}
