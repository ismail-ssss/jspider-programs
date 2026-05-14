
import java.util.Arrays;

class arrayList{
    // add isEmpty size addpos remove indexOf get increase
    Object[] obj = new Object[10];
    int count;
    public void add(Object ele){
        if(count>=obj.length)increase();
        obj[count++]=ele;
    }
    private void increase(){
        obj = Arrays.copyOf(obj, obj.length+6);
    }
    public int size(){return count;}
    public boolean isEmpty(){return count==0;}
}