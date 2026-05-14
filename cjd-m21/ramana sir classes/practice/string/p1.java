class p1{
    public static void main(String[] args) {
        String s = "Ismail";
        char[]ch = s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
            System.err.print(ch[i]);
        }
    }
}