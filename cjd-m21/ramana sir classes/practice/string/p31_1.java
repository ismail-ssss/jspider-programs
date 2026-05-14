class p31_1{
    public static void main(String[] args) {
        String s = "malayalam";
        char[]ch = s.toCharArray();
        int max = 0;
        int max1 = 0;
        // String s2 = "";
        String s3 = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+3; j < ch.length; j++) {
                String s1 = s.substring(i,j);
                if(pali(s1)){
                    System.err.println(s1);
                    if(s1.length()>max)
                    {
                        max1 = max;
                        max = s1.length();
                        // s3 = s2;
                        // s2 = s1;
                    }else if(max1>s1.length()&&max!=s1.length()){
                        // s3 = s1;
                        // max1=s1.length();
                    }
                }     
            }
        }
        System.err.println("=======");
        System.err.println(max1);
        System.err.println(max);
        System.err.println(s3);
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