class p35{
    public static void main(String[] args) {
        String s1 = "jjjjjjjavvvvvaaddddev";
        int max = 0, max2 = 0, max3=0;
        char maxchar = ' ', maxchar2 = ' ',maxchar3 = ' ';
        while(s1.length()!=0){
            char ch = s1.charAt(0);
            String s2 = s1.replace(ch+"", "");
            System.err.println(s2);
            int count = s1.length() - s2.length();
            if(count > max){
                max2 = max;
                maxchar2 = maxchar;
                max = count;
                maxchar = ch;
            }
            else if(count > max2 && count != max){
                maxchar3 = maxchar2;
                max3 = max2;
                maxchar2 = ch;
                max2 = count;
            }
            else if(count > max3 && count != max && count != max2){
                maxchar3 = ch;
                max3 = count;
            }
            s1 = s2;
        }
        System.err.println(maxchar+" = "+max);
        System.err.println(maxchar2+" = "+max2);
        System.err.println(maxchar3+" = "+max3);
    }
}