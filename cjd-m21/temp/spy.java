class Spy
{
    static boolean spy(int n,int s,int p)
    {
        if(s==p)
            return true;
        return spy(n/10, s+(n%10), p*(n%10));
    }
    public static void main(String[] args) 
    {
        System.out.println(spy(123, 0, 1));    
    }
}