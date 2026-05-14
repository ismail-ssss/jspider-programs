import java.util.Scanner;

class avgOfSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mathemetic result : ");
        int math = sc.nextInt();
        System.out.print("Enter physics result : ");
        int phy = sc.nextInt();
        System.out.print("Enter chemistry result : ");
        int che = sc.nextInt();

        int avg = (math+phy+che)/3;
		if(avg >= 70 && avg <= 100) System.out.print("Excellent");
		else if(avg >= 50 && avg <= 69) System.out.print("Good");
		else if(avg >= 25 && avg <= 49) System.out.print("Average");
        else System.out.println("Don't worry life always give next day");
    }
}