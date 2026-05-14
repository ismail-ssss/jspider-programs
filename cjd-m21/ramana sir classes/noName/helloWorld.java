

class helloWorld{
    public static void main(String[] args) {
        String s = "helloWorld";
        char[]c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char count = '1';
            if(c[i]>='0'&&c[i]<='9')continue;
            for (int j = i+1; j < c.length; j++) {
                if(c[i]==c[j]){
                    count++;
                    c[j] = count;
                }
            }
                if(count!='1'){
                    c[i]='1';
                }
        }
        System.err.println(c);
    }
}