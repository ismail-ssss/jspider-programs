class purmutation{
    public static void main(String[] args) {
        String s = "ismail";
        String ch = s;
        int count=0;
        int index = 0;
        while (index==-1){
            count++;
            index = ch.indexOf(s);
        }
        System.err.println(count);
    }
}