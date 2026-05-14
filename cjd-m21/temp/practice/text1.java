class text1{
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,4};
        int n = a.length;
        boolean[] visited = new boolean[n];
        for(int i=0; i<=a.length-1;i++){
                int temp = 0;
                if(visited[i])
                    continue;
            for(int j=0; j<=a.length-1;j++){
                if(a[j]==a[i]){
                    temp++;
                    visited[j]=true;
                }
            }
                System.out.println(a[i]+" count is "+temp);
                temp = 0;
        }
    }
}