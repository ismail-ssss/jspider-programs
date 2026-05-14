import java.util.Scanner;

class secondLargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second No : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third No : ");
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3) 
            System.out.println(n1+" is second largest No");
        else if(n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3)
            System.out.println(n2+" is second largest No");
        else System.out.println(n3+" is second largest No");
    }
}