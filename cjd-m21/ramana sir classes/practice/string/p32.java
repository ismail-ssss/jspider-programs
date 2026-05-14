class p32{
    public static void main(String[] args) {
        String s = "ismail";
        String s2 = "sundar";

        s = s+s2;
        s2 = s.substring(0,s.length()-s2.length());
        s = s.substring(s2.length());

        System.out.println(s);
        System.out.println(s2);
    }
}