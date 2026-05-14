import java.util.Arrays;
public class ArrayList{
    Object[] obj = new Object[10];
    int count = 0;
    public void add(Object ele){
        if(count >= obj.length) increase();
        obj[count++] = ele;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    // private void increase(){
    //     Object[] a = new Object[obj.length+6];
    //     System.arraycopy(obj, 0, a, 0, obj.length);
    //     obj = a;
    // }

    private void increase() {
        obj = Arrays.copyOf(obj, obj.length + 6);
    }

    public Object get(int index){
        if(index < 0 || index > size()) throw new ArrayIndexOutOfBoundsException();
        return obj[index];
    }

    public void add(Object ele,int index){
        if(index < 0 || index > size()) throw new ArrayIndexOutOfBoundsException();
        if(count>=obj.length)increase();
        for (int i = size(); i > index; i--) {
            obj[i]=obj[i-1];
        }
        obj[index] = ele;
        count++;
    }

    public void remove(int index){
        if(index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        for(int i=index; i<size(); i++) obj[i] = obj[i+1];
        count--;
    }

    public int indexOf(Object ele){
        for (int i = 0; i < obj.length; i++) {
            if(obj[i] == ele)
            return i;
        }
        return -1;
    }

}