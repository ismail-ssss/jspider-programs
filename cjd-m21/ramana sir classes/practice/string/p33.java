class p33{
    public static void main(String[] args) {
        String s = "ismail";
        String s1 = ""; 

        while (!s.isEmpty()) {
            char ch = s.charAt(0);
            int ol = s.length();

            s = s.replace(ch + "", ""); 

            int count = ol - s.length(); 
            
            if (!s1.contains(ch + "")) {
                System.out.println(ch + " -> " + count);
                s1 += ch;
            }
        }
    }
}