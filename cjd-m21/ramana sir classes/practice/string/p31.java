class p31{
    public static void main(String[] args) {
        String s = "malayalam";
        char[]ch = s.toCharArray();
        int min = Integer.MAX_VALUE;
        String s2 = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+3; j < ch.length; j++) {
                String s1 = s.substring(i,j);
                if(pali(s1)){
                    if(s1.length()<min)
                    {
                        min = s1.length();
                        s2  = s1;
                    }
                }     
            }
        }
        System.err.println(s2);
    }
    static boolean pali(String s){
        int i = 0, j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
        }
        return true;
    }
}