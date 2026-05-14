class linkedlist{
    // String name = "ismail";
    Node head;
    int count = 0;

    public void add(Object ele){
        if(head==null){
            head = new Node(ele);
            count++;
            return;
        }
        Node curr = head;
        while(curr.next != null) curr = curr.next;
        curr.next = new Node(ele);
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void add(Object ele,int index){
        if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = new Node(ele);
        curr.next.next = curr.next;
    }

    public Object get(int index){
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void remove(int index){
        if(index<0||index>=size())throw new IndexOutOfBoundsException();
        Node curr = head;
        if(index==0){
            head = head.next;
            count--;
            return;
        }
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
    }

    public boolean contains(Object ele){
        Node curr = head;
        while(curr!=null){
            if(curr.ele==ele)return true;
            curr = curr.next;
        }
        return false;
    }
}