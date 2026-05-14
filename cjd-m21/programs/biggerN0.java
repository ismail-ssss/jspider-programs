import java.util.Scanner;
class biggerN0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2/1 value");
        int a = sc.nextInt();
        System.out.println("Enter 2/2 value");
        int b = sc.nextInt();
        String ab = a<b?b+" is biggest":b+" is biggest";
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
    }
}