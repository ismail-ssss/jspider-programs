
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class regex{
    public static void main(String[] args) {
        String s = "abbbaaddefedd";
        String exp = "([a-z])([a-z]\\1)";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.err.println(m.group());
        }
    }
    public static void regex1(String[] args) {
        String s = "abbbaaddefedd";
        String exp = "([a-z])([a-z]\\2)";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.err.println(m.group());
        }
    }
}