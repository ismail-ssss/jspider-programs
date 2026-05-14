
class p1 {

    public static void main(String[] args) {
        String s = "malayalam";
        String s1 = "";
        char[] ch = s.toCharArray();
        int max =0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+2; j < ch.length; j++) {
                s1 = s.substring(i, j);
                if(pali(s1,0,s1.length()-1)){
                    if(s1.length()> max){
                        max = s1.length();
                    }
                }
                    System.err.println(max);
            }
        }
    }
    static boolean  pali(String s,int i,int j){
        if(i==j)return true;
        char[] ch = s.toCharArray();
        if(ch[i]==ch[j]) return pali(s,i+1,j-1);
        return false;
    }
}
