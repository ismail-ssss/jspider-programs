class p8 {
    public static void main(String[] args) {
        String s = "ismsi";
        boolean flag = true;
       int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        
        if (flag) {
            System.err.println("pali"); 
        }else {
            System.err.println("not");
        }
    }
}
