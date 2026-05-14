
class circularLinkedList {

    Node head;
    Node tail;
    int count;

    public void add(Object ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = tail =  newNode;
            tail.next = head;
            count++;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public Object get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = tail;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void remove(int index){
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
}
