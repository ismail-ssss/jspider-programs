import java.util.Scanner;

class p6AvgOfSub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter mathematics");
        double math = sc.nextInt();
        System.err.println("Enter sociology");
        double sociology = sc.nextInt();
        System.err.println("Enter science");
        double science = sc.nextInt();

        double avg = (math+sociology+science)/3;

        if(avg >95){
            System.err.println("Excelent");
        }else if(avg > 75){
            System.err.println("very good");
        }else if(avg > 55){
            System.err.println("good");
        }else if(avg>=30){
            System.err.println("just pass");
        }else{
            System.err.println("fail");
        }
    }
}