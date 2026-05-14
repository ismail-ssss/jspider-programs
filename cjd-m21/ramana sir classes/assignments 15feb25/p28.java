
class p28 {

    public static void main(String[] args) {
        String s = "java is very very easy easy java";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    str[j]="";
                }
            }
            if(!str[i].equals(""))
            System.err.println(str[i]+" = "+count);
        }
    }
}
