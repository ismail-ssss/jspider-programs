
class serialization {

    public static void main(String[] args) {
        String a = "java is easy";
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(i==0||ch[i-1]==' ')
                ch[i] -= 32;
        }
        System.err.println(ch);
    }
}
