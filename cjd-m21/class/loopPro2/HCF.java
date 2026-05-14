

class HCF {

    public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            
            int a = 48 , b=18;
           
           while(b!=0){
            int temp = b;
            b = a%b;
            System.err.println("b = "+b +" a = "+a);
            a = temp;
           }
           System.err.println(a);
    }
}
