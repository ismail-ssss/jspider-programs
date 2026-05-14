class p45{
    public static void main(String[] args) {
        String s = "ismail";
        int key = 3;
        char[]ch=s.toCharArray();
        char t = ch[key-1];
        ch[key-1] = ch[ch.length-key];
        ch[ch.length-key] = t;
        System.err.println(ch);
    }
}