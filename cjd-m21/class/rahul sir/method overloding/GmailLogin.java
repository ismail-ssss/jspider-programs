
import java.util.Scanner;

class GmailLogin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.println("Enter 1 to login throgh email\nelse press 2");
        int n = s.nextInt();
        switch (n) {
            case 1 -> {
                System.err.print("Enter gmail : ");
                String gmail = s.next();
                System.err.print("Enter password : ");
                String pass = s.next();
                GmailLogin.login(gmail, pass);
            }
            case 2 -> {
                System.err.print("Enter phone number : ");
                long mno = s.nextLong();
                System.err.print("Enter password : ");
                String passs = s.next();
                GmailLogin.login(mno, passs);
            }
            default -> {
                System.err.println("invalid input");
            }
        }
    }

    public static void login(String gid, String pass) {
        if (gid.equals("ibhattipuri@gmail.com")) {
            if (pass.equals("pass")) {
                System.err.println("login succesfully");
            } else {
                System.err.println("password wrong");
            }
        } else {
            System.err.println("Invalid number");
        }
    }

    public static void login(long mno, String pass) {
        if (mno==740658089) {
            if (pass.equals("pass")) {
                System.err.println("login succesfully");
            } else {
                System.err.println("password wrong");
            }
        } else {
            System.err.println("Invalid number");
        }
    }
}
