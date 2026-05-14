class p29{
    public static void main(String[] args) {
        String s = "malayalam";
        for(int i=0; i<s.length();i++){
            for(int j=i+3; j<=s.length(); j++){
                if(isPali(s))
                System.err.println(s.substring(i,j));
            }
        }
    }

    static boolean isPali(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}