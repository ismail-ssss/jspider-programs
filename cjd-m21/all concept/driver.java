class driver{
    static void pay(Gpay cash){
        System.out.println(cash);
    }
    static void pay(Ppay cash){
        System.out.println(cash);
    }
    static void pay(payment cash){
        System.out.println(cash);
    }
    public static void main(String[] args) {
        Gpay a = new Gpay();
        // Ppay b = new Ppay();
        // payment c = new payment();
        a.makePayment(11);
    }
}