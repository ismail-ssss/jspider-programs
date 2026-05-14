

class stack{
    Node first;
    int count;

    public void push(Object ele){
        if(first==null){
            first = new Node(ele);
            count++;
            return;
        }
        first = new Node(ele,first);
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;    
    }

    public Object peek(){
        return first.ele;
        
    }

    public Object pop(){
        Object ele = first.next;
        first = first.next;
        return ele;
    }


}