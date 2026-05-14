
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class numberV{
    public static void main(String[] args) {
        String exp = "[9876][0-9]{9}";
        String s = "asdkjhgqk;h23287492387942392874927398";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.err.println(m.group());
        }
    }
}