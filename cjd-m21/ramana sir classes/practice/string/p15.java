import java.util.Arrays;
class p15{
    public static void main(String[] args) {
        String s = "   iism  aill  ";
        char[] ch = s.toCharArray();
        
        int start = 0, end = ch.length - 1;

        while (start < ch.length && ch[start] == ' ') {
            start++;
        }
        

        while (end > start && ch[end] == ' ') {
            end--;
        }

        String result = new String(ch, start, end - start+1); 
        char[]ch1 = result.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }

}