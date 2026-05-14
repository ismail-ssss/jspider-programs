class p40{
    public static void main(String[] args) {
        String s = "india";
        String ch = "aeiouAEIOU";
        for(int i=0; i<ch.length();i++){
            char c = ch.charAt(i);
            if(!s.contains(c+"")){
                System.out.print(c);
            }
        }
    }
}