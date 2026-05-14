class Gpay implements pay{
    @Override
    public void makePayment(int amount){
        if(amount > 10){
            System.out.println("more then 10");
        }else{
            System.out.println("less then 10");
        }
    }
}
