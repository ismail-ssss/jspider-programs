class p46{
    public static void main(String[] args) {
        String s = "a5bcd3e1";
        String n = "0123456789";

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(!s.contains(ch+"")){
                System.err.print(ch);
            }
        }
    }
}