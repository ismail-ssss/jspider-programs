
import java.util.Arrays;

class p14{
    public static void main(String[] args) {
        String s = "iismaill";
        char[] ch = s.toCharArray();
        // for(int i=0; i<ch.length;i++){
            for (int j = 1; j < ch.length; j++) {
                if(ch[j-1]==ch[j]){
                    ch[j-1]='$';
                }
            }
        // }
        System.err.println(Arrays.toString(ch));
    }
}